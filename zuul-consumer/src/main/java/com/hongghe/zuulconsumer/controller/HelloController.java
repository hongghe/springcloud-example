package com.hongghe.zuulconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/")
    public  String hello()
    {
        return  restTemplate.getForEntity("http://cloud-simple-service/",String.class).getBody();
    }
}
