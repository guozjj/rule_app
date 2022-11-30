package com.fnd.server;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ruleApp {

    public static void main(String[] args) {
        SpringApplication.run(ruleApp.class,args);
        log.info("server启动成功，^_^ ");
    }
}
