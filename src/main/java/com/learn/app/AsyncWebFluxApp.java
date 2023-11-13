package com.learn.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@EnableR2dbcRepositories
@SpringBootApplication
@ComponentScan(basePackages = "com.learn.app")
public class AsyncWebFluxApp {

    public static void main(String[] args) {
        SpringApplication.run(AsyncWebFluxApp.class, args);
    }
}
