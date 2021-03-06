package com.moguying.plant.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication(scanBasePackages = {"com.moguying"})
@EnableTransactionManagement
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true,exposeProxy = true)
public class PlantWebApplication {

    @PostConstruct
    private void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("GMT+8"));
    }


    public static void main(String[] args) {
        SpringApplication.run(PlantWebApplication.class, args);
    }

}
