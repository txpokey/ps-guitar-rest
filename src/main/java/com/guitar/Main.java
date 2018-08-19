package com.guitar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan({"sci.shopping.domain","com.guitar.model"})
@EnableJpaRepositories(basePackages={"com.guitar.repository", "sci.shopping.repo" })

@SpringBootApplication(scanBasePackages = {"sci.security.config"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
