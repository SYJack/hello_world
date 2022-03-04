package com.jack.helloworld;

import com.jack.helloworld.config.DBConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//@EnableConfigurationProperties({DBConfig.class})
public class HelloWorldApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =  SpringApplication.run(HelloWorldApplication.class, args);
        DBConfig bean =  context.getBean(DBConfig.class);
        System.out.println(bean);
    }
}
