package com.ybq.eurekauser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaUserApplication.class, args);
    }

}
