package com.fnd.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class ruleApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(ruleApp.class,args);
//        log.info("server启动成功，^_^ ");
        System.out.println("启动成功！");
    }
}
