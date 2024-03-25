package com.demo.orderofservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.demo.orderofservice.service.DBService;

@Configuration
@Profile("dev")
public class DevConfig {

    @Autowired
    private DBService dbService;

    @Value("${  jpa:\r\n" + //
            "    hibernate:\r\n" + //
            "      ddl-auto:}")
    private String dll;

    @Bean
    public boolean instanceDb() {

        this.dbService.instanceDb();

        if (dll.equals("create")) {
            this.dbService.instanceDb();
        }
        return false;
    }
}
