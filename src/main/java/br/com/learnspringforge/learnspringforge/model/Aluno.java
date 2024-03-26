package br.com.learnspringforge.learnspringforge.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aluno {

    private static List<Aluno> alunosCadastrados = new ArrayList<>();

    private long id_aluno;
    private static long countId = 0;
    private String nome;
    private Date nascimento;

    //CONSTRUTOR
    public Aluno(String nome, Date nascimento) {
        this.id_aluno = ++countId;
        this.nome = nome;
        this.nascimento = nascimento;
        cadastrarAluno(this); // Chamada para o método de inclusão na lista de alunos cadastrados
    }

    public static List<Aluno> getAlunosCadastrados() {
        return alunosCadastrados;
    }

    private static void cadastrarAluno(Aluno aluno) {
        alunosCadastrados.add(aluno);
    }

    // Método para encontrar um aluno pelo ID # card 8
    public static Aluno encontrarAlunoPorId(long id) {
        for (Aluno aluno : alunosCadastrados) {
            if (aluno.getID() == id) {
                return aluno;
            }
        }
        return null; // Retorna null se nenhum aluno for encontrado com o ID especificado
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
