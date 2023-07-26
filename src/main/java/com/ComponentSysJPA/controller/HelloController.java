package com.ComponentSysJPA.controller;

import com.ComponentSysJPA.entity.Part;
import com.ComponentSysJPA.repository.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloController {
    @Autowired
    PartRepository part;
    @RequestMapping("/hello")
    public String sayHello() {
//        Optional<Part> id = part.findById(1L);
//        String osper = id.stream().findFirst().get().getName();
        return "hello spring boot jpa ==> ";
    }
}
