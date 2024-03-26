package br.com.learnspringforge.learnspringforge.service;

import br.com.learnspringforge.learnspringforge.model.Aluno;
import br.com.learnspringforge.learnspringforge.model.Curso;
import lombok.Getter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoService {
    @Getter
    private static List<Curso> cursosCadastrados = new ArrayList<>();

    public static void cadastrarCurso(Curso curso) {
        cursosCadastrados.add(curso);
    }

    // Método para encontrar um curso pelo ID
    public static Curso encontrarCursoPorId(long id) {
        for (Curso curso : cursosCadastrados) {
            if (curso.getId_curso() == id) {
                return curso;
            }
        }
        return null; // Retorna null se nenhum curso for encontrado com o ID especificado
    }

    // Método para realizar a matrícula de um aluno em um curso
    public static void realizarMatricula(long idCurso, Aluno aluno) {
        Curso curso = encontrarCursoPorId(idCurso);
        if (curso != null) {
            curso.adicionarAluno(aluno);
        } else {
            System.out.println("Curso não encontrado com o ID especificado.");
        }
    }

    public void matricularAlunoNoCurso(long idCurso, long id) { // CARD 8
        Aluno aluno = AlunoService.encontrarAlunoPorId(id);
        if (aluno != null) {
            CursoService.realizarMatricula(idCurso, aluno);
        } else {
            System.out.println("Aluno não encontrado com o ID especificado.");
        }
    }
}
