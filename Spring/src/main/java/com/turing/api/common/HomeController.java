package com.turing.api.common;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;


// @CrossOrigin(origins = "http://localhost:3000")
// @RestController
// @RequiredArgsConstructor
public class HomeController {


    @GetMapping("/")
    public String hello() {
        return "welcome to Spring Boot !! ";
    }

}
