package com.javaaapplication.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.javaaapplication.springboot.configuration.JpaConfiguration;

@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.javaaapplication.springboot"})
public class Application {

	public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}


