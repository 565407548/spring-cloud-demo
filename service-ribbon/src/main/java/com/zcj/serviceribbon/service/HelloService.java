package com.zcj.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @description:
 * @author: Zheng Jim
 * @date: 18-11-28 上午11:03
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name, String token) {
        return restTemplate.getForObject(String.format("http://SERVICE-HI/hi?name=%s&token=%s", name, token), String.class);
    }

    public String hiError(String name, String token) {
        return String.format("hi, name=%s token=%s,  sorry, server-hi error!", name, token);
    }
}
