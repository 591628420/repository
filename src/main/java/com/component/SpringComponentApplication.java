package com.component;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.component.mapper")
public class SpringComponentApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringComponentApplication.class, args);
        String property = run.getEnvironment().getProperty("server.port");
        System.out.println(property+"-------nacos");

    }

}
