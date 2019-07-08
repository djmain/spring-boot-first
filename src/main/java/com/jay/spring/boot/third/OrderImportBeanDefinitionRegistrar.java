package com.jay.spring.boot.third;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.util.StringUtils;

/**
 * created by Jay on 2019/7/6
 */
public class OrderImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar
{
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry)
    {
        String beanName = StringUtils.uncapitalize(OrderService.class.getSimpleName());
        beanDefinitionRegistry.registerBeanDefinition(beanName, new RootBeanDefinition(OrderService.class));
    }
}
