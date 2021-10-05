package com.huguoya.testdocker;

import com.huguoya.testdocker.configuration.YmlConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.time.LocalDateTime;

@SpringBootApplication
@Slf4j
public class TestDockerApplication {

    public static void main(String[] args) {
        log.info("project start" + LocalDateTime.now());

        ConfigurableApplicationContext context = SpringApplication.run(TestDockerApplication.class, args);
        System.out.println("http://localhost:" + context.getBean(YmlConfig.class).getPort() + "/doc.html");
    }

}
