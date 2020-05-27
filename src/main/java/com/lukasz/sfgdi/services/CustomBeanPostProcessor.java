package com.lukasz.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor: " + beanName);
        if(bean instanceof LifeCycleDemoBean){
            ((LifeCycleDemoBean)bean).beforInit();
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanPostProcessor: " + beanName);
        if(bean instanceof LifeCycleDemoBean){
            ((LifeCycleDemoBean)bean).afterInit();
        }
        return bean;
    }
}
