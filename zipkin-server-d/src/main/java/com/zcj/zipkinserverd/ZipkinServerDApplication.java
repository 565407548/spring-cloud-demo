package com.zcj.zipkinserverd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EnableZipkinServer
public class ZipkinServerDApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinServerDApplication.class, args);
    }
}
