package com.nevt.gbt32960;

import com.nevt.gbt32960.service.Server;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@Slf4j
@EnableCaching
@SpringBootApplication
public class Gbt32960Application implements CommandLineRunner, ApplicationContextAware {

    private ApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(Gbt32960Application.class, args);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }


    @Override
    public void run(String... args) throws Exception {
        Server server = context.getBean(Server.class);
        try {
            server.run();
        } catch (Exception e) {
            log.trace("GBT32960 Server run fail! ==> " + e.getMessage());
        }
    }

}
