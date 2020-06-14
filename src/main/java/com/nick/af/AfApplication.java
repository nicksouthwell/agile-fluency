package com.nick.af;

import com.nick.af.domain.Game;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AfApplication {

    public static void main(String[] args) {
        SpringApplication.run(AfApplication.class, args);
    }

    @Bean
    Game theGame() {
        return new Game();
    }
}
