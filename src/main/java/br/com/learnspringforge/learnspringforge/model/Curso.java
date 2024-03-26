package br.com.learnspringforge.learnspringforge.model;

import java.util.ArrayList;
import java.util.List;

import static br.com.learnspringforge.learnspringforge.service.CursoService.cadastrarCurso;

public class Curso {
    private static List<Curso> cursosCadastrados = new ArrayList<>();
    private long id_curso;
    private static long countId = 0;
    private String nome;
    private String descricao;
    private short cargaHoraria;

    public Curso(String nome, String descricao, short cargaHoraria) {
        this.id_curso = ++countId;
        this.nome = nome;
        this.descricao = descricao;
        if (cargaHoraria <= 900000 && cargaHoraria >= 1){
            this.cargaHoraria = cargaHoraria;
        }
        cadastrarCurso(this); // Chamada para o método de inclusão na lista de cursos cadastrados
    }

    public static List<Curso> getCursosCadastrados() {
        return cursosCadastrados;
    }

    private static void cadastrarCurso(Curso curso) {
        cursosCadastrados.add(curso);
    }

    public long getId_curso() {
        return id_curso;
    }

    public static long getCountId() {
        return countId;
    }

    public static void setCountId(long countId) {
        Curso.countId = countId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public short getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(short cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
