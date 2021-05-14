package com.example.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@SpringBootApplication
@RestController
public class ResourceApplication {

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.cors().and().authorizeRequests()
//                .anyRequest().authenticated();
//    }

    @GetMapping("/data")
    public String Data() {
        return "Git test";
    }

    @RequestMapping("/")
//    @CrossOrigin(origins = "*", maxAge = 3600,
//            allowedHeaders = {"X-Auth-Token", "X-Request-With", "X-xsrf-token"})
    public Message home() {
        return new Message("Hello World");
    }

    public static void main(String[] args) {
        SpringApplication.run(ResourceApplication.class, args);
    }

//    @Bean
//    HeaderHttpSessionStrategy sessionStrategy() {
//        return new HeaderHttpSessionStrategy();
//    }
}

class Message {
    private String id = UUID.randomUUID().toString();
    private String content;

    public Message(String content) {
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
