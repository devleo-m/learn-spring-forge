package br.com.learnspringforge.learnspringforge.controller;

import br.com.learnspringforge.learnspringforge.model.Curso;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {
    @GetMapping(path = "/curso")
    public Curso curso(){
        return new Curso("Java", "Curso intro de java", (short) 540);
    }
}
