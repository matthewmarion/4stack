package gg.fourstack.api;

import gg.fourstack.api.model.Player;
import gg.fourstack.api.model.Team;
import gg.fourstack.api.repository.PlayerRepository;
import gg.fourstack.api.repository.TeamRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"gg.fourstack.api.repository"})
public class ApiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ApiApplication.class, args);
    }



}
