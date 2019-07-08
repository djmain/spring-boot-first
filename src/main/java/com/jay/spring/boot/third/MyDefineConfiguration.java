package com.jay.spring.boot.third;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * created by Jay on 2019/7/6
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({MyImportSelector.class, OrderImportBeanDefinitionRegistrar.class})
public @interface MyDefineConfiguration
{
    Class<?>[] exclude() default {};
}
