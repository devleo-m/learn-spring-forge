package br.com.learnspringforge.learnspringforge.model;

//import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Aluno {
    private long id_aluno;
    private static long countId = 0;
    private String nome;
    private Date nascimento;
    private static ArrayList<Aluno> alunosCadastrados = new ArrayList<>(); // here card 4

    //CONSTRUTOR
    public Aluno(String nome, Date nascimento) {
        this.id_aluno = ++countId;
        this.nome = nome;
        this.nascimento = nascimento;
        cadastrarAlunos(this); // here card 4
    }

    //METODOS
    // metodo card 4
    public void cadastrarAlunos(Aluno aluno){
        this.alunosCadastrados.add(aluno);
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

    //Card 4 getts e setts alunos cadastrados
    public static ArrayList<Aluno> getAlunosCadastrados() {
        return new ArrayList<>(alunosCadastrados);
    }

    public void setAlunosCadastrados(ArrayList<Aluno> alunosCadastrados) {
        this.alunosCadastrados = alunosCadastrados;
    }
    //Fim card 4 de alunos cadastrados
}
