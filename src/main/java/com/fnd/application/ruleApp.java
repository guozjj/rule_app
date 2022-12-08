package com.fnd.application;

//import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@Slf4j
@EnableJpaRepositories(value = "com.fnd")
@ComponentScan(basePackages = "com.fnd")
@EntityScan(basePackages = "com.fnd")
@MapperScan("com.fnd.mapper")
public class ruleApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(ruleApp.class,args);
//        log.info("server启动成功，^_^ ");
        System.out.println("启动成功！");
    }
}
