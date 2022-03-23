package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student avishka = new Student(
                    "Avishka",
                    "avishka@codegen.net",
                    LocalDate.of(1996, NOVEMBER, 3)
            );

            Student alex = new Student(
                    "Alex",
                    "avishka@gmail.com",
                    LocalDate.of(2000, NOVEMBER, 5)
            );

            repository.saveAll(
                    List.of(avishka, alex)
            );
        };
    }
}
