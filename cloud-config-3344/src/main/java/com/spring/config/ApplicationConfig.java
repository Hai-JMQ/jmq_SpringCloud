package com.spring.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ApplicationConfig {
    public static void main(String[] args) {
        System.out.println(SpringApplication.run(ApplicationConfig.class,args));
    }
}
