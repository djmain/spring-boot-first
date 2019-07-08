package com.jay.spring.boot.second.current;

import com.jay.spring.boot.second.other.OtherBean;
import com.jay.spring.boot.second.other.OtherConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * created by Jay on 2019/7/6
 */
@Configuration
@Import(OtherConfig.class)
public class SpringConfig
{
    @Bean
    public DefaultBean defaultBean()
    {
        return new DefaultBean();
    }
}
