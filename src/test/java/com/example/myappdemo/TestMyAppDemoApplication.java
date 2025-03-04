package com.example.myappdemo;

import org.springframework.boot.SpringApplication;

public class TestMyAppDemoApplication {

    public static void main(String[] args) {
        SpringApplication.from(MyAppDemoApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
