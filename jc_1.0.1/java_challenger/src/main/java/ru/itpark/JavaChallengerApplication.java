package ru.itpark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "ru.itpark")
public class JavaChallengerApplication {

	public static void main(String[] args) {

		SpringApplication.run(JavaChallengerApplication.class, args);

	}
}
