package br.com.learnspringforge.learnspringforge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
@GetMapping(path = "/ola")
    public String hello(){
        return "Hello, world!";
    }
}
