package com.metin.microservice.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MovieEurekaServer {
    public static void main(String[] args) {

        SpringApplication.run(MovieEurekaServer.class, args);
    }
}