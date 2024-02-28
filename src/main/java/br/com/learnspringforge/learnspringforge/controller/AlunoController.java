package br.com.learnspringforge.learnspringforge.controller;

import br.com.learnspringforge.learnspringforge.model.Aluno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;

@RestController
public class AlunoController {
    @GetMapping(path = "/aluno")
    public Aluno alunoController(){
        Date date = new Date("December 17, 1995 03:24:00");
        return new Aluno("Fulano", (Date) date);
    }
}
