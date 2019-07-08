package com.jay.spring.boot.second.other;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * created by Jay on 2019/7/6
 */
@Configuration
public class OtherConfig
{
    @Bean
    public OtherBean otherBean()
    {
        return new OtherBean();
    }
}
