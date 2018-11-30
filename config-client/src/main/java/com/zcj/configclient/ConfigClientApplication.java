package com.zcj.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 配置config：  https://blog.csdn.net/forezp/article/details/81041028
 * 更新config：  https://windmt.com/2018/04/19/spring-cloud-7-config-sample/
 * curl -X POST http://localhost:8721/actuator/refresh
 * curl -X POST http://localhost:8721/actuator/bus-refresh
 * @author zcj
 */
@SpringBootApplication
@RestController
@EnableEurekaClient
@EnableDiscoveryClient
@RefreshScope
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);
    }

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/foo")
    public String foo() {
        return foo;
    }
}
