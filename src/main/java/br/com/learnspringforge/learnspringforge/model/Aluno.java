package br.com.learnspringforge.learnspringforge.model;

//import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Aluno {
    private long id_aluno;
    private static long countId = 0;
    private String nome;
    private Date nascimento;

    //CONSTRUTOR
    public Aluno(String nome, Date nascimento) {
        this.id_aluno = ++countId;
        this.nome = nome;
        this.nascimento = nascimento;
    }

    //GETTS E SETTS
    public long getID() {
        return id_aluno;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getNascimento() {
        return nascimento;
    }
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

}
