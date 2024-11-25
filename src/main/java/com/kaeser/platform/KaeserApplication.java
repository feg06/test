package com.kaeser.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing //Habilita esto
public class KaeserApplication {

    public static void main(String[] args) {
        SpringApplication.run(KaeserApplication.class, args);
    }

}
