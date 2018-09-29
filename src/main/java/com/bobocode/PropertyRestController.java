package com.bobocode;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/properties")
public class PropertyRestController {
    @Value("${SPRING_DATASOURCE_URL}")
    private String url;

    @Value("${JDBC_DATABASE_USERNAME}")
    private String username;

    @Value("${JDBC_DATABASE_PASSWORD}")
    private String password;

    @GetMapping("/url")
    public String getUrl() {
        return url;
    }

    @GetMapping("/username")
    public String getUsername() {
        return username;
    }

    @GetMapping("/password")
    public String getPassword() {
        return password;
    }
}
