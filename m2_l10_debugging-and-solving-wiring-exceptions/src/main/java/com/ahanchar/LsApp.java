package com.ahanchar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.ahanchar.service", "com.ahanchar.persistence.repository"})
public class LsApp {

    public static void main(final String... args) {
        SpringApplication.run(LsApp.class, args);
    }

}
