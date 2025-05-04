package net.arw9234.spring_boot_mvc_demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReflectParamsController {
    @GetMapping("/reflect")
    public String reflect(
        @RequestParam(value = "param") String param
    ) {
        return "<pre>I am a Spring application! You submitted: " + param + "</pre>";
    }
}
