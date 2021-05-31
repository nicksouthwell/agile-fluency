package com.nick.af;

import com.nick.af.project.adapter.out.persistence.CardLoaderAdapter;
import com.nick.af.project.application.ProjectService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AfApplication {

    public static void main(String[] args) {
        SpringApplication.run(AfApplication.class, args);
    }

    @Bean
    CardLoaderAdapter cardLoader() {
        return new CardLoaderAdapter();
    }

    @Bean
    ProjectService theGame() {
        CardLoaderAdapter cardLoader = cardLoader();
        return new ProjectService(cardLoader, cardLoader);
    }
}
