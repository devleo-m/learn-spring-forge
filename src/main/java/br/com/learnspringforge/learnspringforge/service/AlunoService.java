package br.com.learnspringforge.learnspringforge.service;
import br.com.learnspringforge.learnspringforge.model.Aluno;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// CARD 4
@Service
public class AlunoService {
    private static List<Aluno> alunosCadastrados = new ArrayList<>();

    public static List<Aluno> getAlunosCadastrados() {
        return alunosCadastrados;
    }

    public static void cadastrarAluno(Aluno aluno) {
        alunosCadastrados.add(aluno);
    }

    // Método para encontrar um aluno pelo ID
    public static Aluno encontrarAlunoPorId(long id) {
        for (Aluno aluno : alunosCadastrados) {
            if (aluno.getID() == id) {
                return aluno;
            }
        }
        return null; // Retorna null se nenhum aluno for encontrado com o ID especificado
    }

}

