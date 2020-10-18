package com.steppedua.tweater;

import com.steppedua.tweater.repository.MessageRepository;
import com.steppedua.tweater.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@EnableJpaRepositories
@Import({UserRepository.class, MessageRepository.class})
public class SweaterApplication {
    public static void main(String[] args) {
        SpringApplication.run(SweaterApplication.class, args);
    }
}
