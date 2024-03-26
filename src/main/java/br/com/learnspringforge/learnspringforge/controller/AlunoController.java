package br.com.learnspringforge.learnspringforge.controller;
import br.com.learnspringforge.learnspringforge.model.Aluno;
import br.com.learnspringforge.learnspringforge.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/api/alunos")
public class AlunoController {
    private final AlunoService alunoService;
    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }
    @GetMapping("/todos")
    public List<Aluno> consultarTodosAlunos() {
        return alunoService.getAlunosCadastrados();
    }
    @PostMapping("/cadastro")
    public void cadastrarAluno(@RequestBody Aluno aluno) {
        alunoService.cadastrarAluno(aluno);
    }
}
