package com.stackroute.demo;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemoBean implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName){
        System.out.println("postProcessBeforeInitialization, Bean Name : " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName){
        System.out.println("postProcessAfterInitialization, Bean Name : " + beanName);
        return bean;
    }
}
