package com.testing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.testing" })
public class HelloWorldApplication {
    // to trigger genkin build
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }
}
