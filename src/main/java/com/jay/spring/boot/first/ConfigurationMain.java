package com.jay.spring.boot.first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * created by Jay on 2019/7/6
 */
public class ConfigurationMain
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationDemo.class);
        DemoClass demoClass = applicationContext.getBean(DemoClass.class);
        demoClass.say();
    }

}
