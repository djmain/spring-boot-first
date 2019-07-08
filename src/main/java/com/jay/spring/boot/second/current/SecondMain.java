package com.jay.spring.boot.second.current;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * created by Jay on 2019/7/6
 */
@ComponentScan
public class SecondMain
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SecondMain.class);
        String[] definitionNames = applicationContext.getBeanDefinitionNames();
        for (String definitionName : definitionNames)
        {
            System.out.println(definitionName);
        }
    }

}
