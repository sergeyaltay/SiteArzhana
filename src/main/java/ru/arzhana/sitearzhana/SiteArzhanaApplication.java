package ru.arzhana.sitearzhana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class SiteArzhanaApplication {
    public static void main(String[] args) {
        SpringApplication.run(SiteArzhanaApplication.class, args);
    }


}
