package org.course.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    private final String HELLO_WORLD_FILE = "index.html";

    @GetMapping("/hello-world-file")
    public String helloWorldFile(){
        return HELLO_WORLD_FILE;
    }

}
