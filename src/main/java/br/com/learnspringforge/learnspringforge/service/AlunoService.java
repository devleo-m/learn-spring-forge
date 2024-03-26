package br.com.learnspringforge.learnspringforge.service;
import br.com.learnspringforge.learnspringforge.model.Aluno;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// CARD 4!!!
public class AlunoService {
    private static List<Aluno> alunosCadastrados = new ArrayList<>();

    public static List<Aluno> getAlunosCadastrados() {
        return alunosCadastrados;
    }

    public static void cadastrarAluno(String nome, Date nascimento) {
        Aluno aluno = new Aluno(nome, nascimento);
        alunosCadastrados.add(aluno);
    }
}

