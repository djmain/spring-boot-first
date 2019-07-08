package com.jay.spring.boot.fourth;

import com.jay.spring.boot.EmpService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * created by Jay on 2019/7/8
 */
@SpringBootApplication
public class FourthMain
{
    public static void main(String[] args)
    {

//        EmpService empService = new EmpService();
//        empService.print();
        ConfigurableApplicationContext applicationContext = SpringApplication.run(FourthMain.class, args);
        /**
         * 没有自动装配的情况下，会抛出异常
         Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type 'com.jay.spring.boot.EmpService' available
         at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:346)
         at org.springframework.beans.factory.support.DefaultListableBeanFactory.getBean(DefaultListableBeanFactory.java:337)
         at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1123)
         at com.jay.spring.boot.fourth.FourthMain.main(FourthMain.java:21)
         */
        System.out.println(applicationContext.getBean(EmpService.class));
    }
}
