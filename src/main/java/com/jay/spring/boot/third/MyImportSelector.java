package com.jay.spring.boot.third;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.AbstractCollection;
import java.util.Map;

/**
 * created by Jay on 2019/7/6
 */
public class MyImportSelector implements ImportSelector
{
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata)
    {
        Map<String, Object> annotationAttributes = annotationMetadata.getAnnotationAttributes(MyDefineConfiguration.class.getName());
        System.out.println("attr:" + annotationAttributes);
        return new String[]{CacheService.class.getName()};
    }
}
