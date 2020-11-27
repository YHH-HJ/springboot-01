package com.atguigu.controller;


import com.atguigu.properties.DataSourcesProperties;
import com.atguigu.properties.JdbcProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties(DataSourcesProperties.class)
public class HelloController {

    @Autowired
    JdbcProperties jdbcProperties;

    @RequestMapping("/hello")
    public String sayHello(){

        System.out.println(jdbcProperties);
        return "hello spring boot";
    }
}
