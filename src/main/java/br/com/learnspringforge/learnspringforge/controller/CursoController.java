package br.com.learnspringforge.learnspringforge.controller;

import br.com.learnspringforge.learnspringforge.model.Curso;
import br.com.learnspringforge.learnspringforge.service.CursoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/cursos")
public class CursoController {
    private final CursoService cursoService;
    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }
    @GetMapping()
    public List<Curso> consultarTodosCursos() {
        return cursoService.getCursosCadastrados();
    }
    @PostMapping()
    public void cadastrarCurso(@RequestBody Curso curso) {
        cursoService.cadastrarCurso(curso);
    }
}
