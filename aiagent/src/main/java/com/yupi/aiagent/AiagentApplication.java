package com.yupi.aiagent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class AiagentApplication {

    public static void main(String[] args) {
        SpringApplication.run(AiagentApplication.class, args);
    }

}
