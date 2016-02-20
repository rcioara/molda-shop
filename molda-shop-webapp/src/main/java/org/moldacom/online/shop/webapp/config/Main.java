package org.moldacom.online.shop.webapp.config;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by roxi on 20.02.2016.
 */
@SpringBootApplication
@ComponentScan({"org.moldacom.online.shop.services", "org.moldacom.online.shop.webapp.controllers"})
@EnableJpaRepositories("org.moldacom.online.shop.repositories")
@EnableTransactionManagement
@EntityScan("org.moldacom.online.shop.entities")
public class Main {

    public static void main(String[] args){
        SpringApplication.run(Main.class);
    }
}
