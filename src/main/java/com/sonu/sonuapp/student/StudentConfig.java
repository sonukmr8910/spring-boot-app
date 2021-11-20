package com.sonu.sonuapp.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student john_doe = new Student(
                    "John Doe",
                    "john@doe.com",
                    LocalDate.of(2000, JANUARY, 26)
            );

            Student maria = new Student(
                    "Maria Jane",
                    "maria@jane.com",
                    LocalDate.of(2012, JANUARY, 12)
            );

            studentRepository.saveAll(
                    List.of(john_doe, maria)
            );
        };
    }
}
