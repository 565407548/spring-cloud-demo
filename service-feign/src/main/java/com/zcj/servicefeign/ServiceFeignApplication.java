package com.zcj.servicefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableFeignClients
public class ServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFeignApplication.class, args);
    }

//    @Autowired
//    HelloClient client;
//
//    @RequestMapping("/")
//    public String hello() {
//        return client.hello();
//    }
//
//    @FeignClient("HelloServer")
//    interface HelloClient {
//        @RequestMapping(value = "/", method = GET)
//        String hello();
//    }
}
