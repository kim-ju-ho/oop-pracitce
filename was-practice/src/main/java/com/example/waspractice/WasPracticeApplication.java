package com.example.waspractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

//@SpringBootApplication
public class WasPracticeApplication {

    public static void main(String[] args) throws IOException {
        new CustomWebApplicationServer(8081).start();
        //SpringApplication.run(WasPracticeApplication.class, args);
    }

}
