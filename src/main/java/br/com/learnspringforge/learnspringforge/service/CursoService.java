package br.com.learnspringforge.learnspringforge.service;

import br.com.learnspringforge.learnspringforge.model.Curso;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoService {
    private static List<Curso> cursosCadastrados = new ArrayList<>();

    public static List<Curso> getCursosCadastrados() {
        return cursosCadastrados;
    }

    public static void cadastrarCurso(Curso curso) {
        cursosCadastrados.add(curso);
    }
}
