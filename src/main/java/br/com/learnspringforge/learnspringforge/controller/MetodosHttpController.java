package br.com.learnspringforge.learnspringforge.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/metodos")
public class MetodosHttpController {

    @GetMapping
    public String GET(){
        return "Metodo GET";
    }

    @PostMapping
    public String POST(){
        return "Metodo POST";
    }

    @PutMapping
    public String PUT(){
        return "Metodo PUT";
    }

    @PatchMapping
    public String PATCH(){
        return "Metodo PATCH";
    }

    @DeleteMapping
    public String DELETE(){
        return "Metodo DELETE";
    }
}
