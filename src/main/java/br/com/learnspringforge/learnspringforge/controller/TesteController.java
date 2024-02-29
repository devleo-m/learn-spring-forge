package br.com.learnspringforge.learnspringforge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/teste")
public class TesteController {
    @GetMapping("/{id}")
    public String testeGetId(@PathVariable int id){
        return "Id : ("+ id + ") ";
    }

//    @GetMapping("{id}")
//    public String getId(@PathVariable Integer id){
//        return "GET / TESTE2!!" + id;
//    }
}
