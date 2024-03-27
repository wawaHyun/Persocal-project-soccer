package com.study.api.common;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequiredArgsConstructor
public class HomeController {


    @GetMapping("/")
    public String hello() {
        return "welcome to Spring Boot !! ";
    }

}
