package br.com.learnspringforge.learnspringforge.service;

import br.com.learnspringforge.learnspringforge.model.Curso;

import java.util.ArrayList;
import java.util.List;

public class CursoService {
    private static List<Curso> cursosCadastrados = new ArrayList<>();

    public static List<Curso> getCursosCadastrados() {
        return cursosCadastrados;
    }

    public static void cadastrarCurso(Curso curso) {
        cursosCadastrados.add(curso);
    }
}
