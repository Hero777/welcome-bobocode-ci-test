package com.bobocode;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    @GetMapping
    public String hello(@RequestParam(name = "name", defaultValue = "Bobo") String name) {
        return "<h1>Hello, " + name + " +</h1>";
    }
}
