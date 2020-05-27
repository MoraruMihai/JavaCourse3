package org.course.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class DefaultController {

    @GetMapping("/")
    public String defaultEndPoint(){
        return "Hello World Default";
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
}
