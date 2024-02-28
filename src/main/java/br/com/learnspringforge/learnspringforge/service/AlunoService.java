package br.com.learnspringforge.learnspringforge.service;
import br.com.learnspringforge.learnspringforge.model.Aluno;

import java.util.ArrayList;
import java.util.Date;

public class AlunoService {
    public void adicionarNovoAluno(String nome, Date nascimento){
        new Aluno(nome, nascimento);
    }
    public ArrayList<Aluno> visualizarTodosAlunos(){
        return Aluno.getAlunosCadastrados();
    }

}
