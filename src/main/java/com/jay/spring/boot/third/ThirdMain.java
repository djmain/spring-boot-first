package com.jay.spring.boot.third;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * created by Jay on 2019/7/6
 */
@SpringBootApplication
@MyDefineConfiguration
public class ThirdMain
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ThirdMain.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames)
        {
            System.out.println(beanDefinitionName);
        }
    }
}
