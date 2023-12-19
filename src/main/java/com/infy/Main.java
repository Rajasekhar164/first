package com.infy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.infy.controller")
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})

public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class,args);
    }
}
