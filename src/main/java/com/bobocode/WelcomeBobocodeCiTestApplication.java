package com.bobocode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class WelcomeBobocodeCiTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(WelcomeBobocodeCiTestApplication.class, args);
    }

    @GetMapping
    public String welcome() {
        return "welcome";
    }
}
