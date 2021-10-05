package com.huguoya.testdocker;

import com.huguoya.testdocker.configuration.YmlConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestDockerApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context=  SpringApplication.run(TestDockerApplication.class, args);
        System.out.println("http://localhost:"+context.getBean(YmlConfig.class).getPort()+"/doc.html");
    }

}
