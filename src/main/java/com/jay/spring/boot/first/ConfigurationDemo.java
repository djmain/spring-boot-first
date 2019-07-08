package com.jay.spring.boot.first;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * created by Jay on 2019/7/6
 */
@Configuration
public class ConfigurationDemo
{
    @Bean
    public DemoClass demoClass()
    {
        System.out.println("creating bean-demoClass");
        return new DemoClass();
    }
}
