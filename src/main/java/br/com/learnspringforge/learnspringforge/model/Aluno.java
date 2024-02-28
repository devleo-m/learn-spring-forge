package br.com.learnspringforge.learnspringforge.model;

//OBS CARD 2

//import java.time.LocalDate;
import javax.xml.crypto.Data;
import java.util.Date;

public class Aluno {
    private long id_aluno;
    private static long countId = 0;
    private String nome;
    private Date nascimento;

    public Aluno(String nome, Date nascimento) {
        this.id_aluno = ++countId;
        this.nome = nome;
        this.nascimento = (Date) nascimento;
    }

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
        return (Date) nascimento;
    }
    public void setNascimento(Date nascimento) {
        this.nascimento = (Date) nascimento;
    }
}
