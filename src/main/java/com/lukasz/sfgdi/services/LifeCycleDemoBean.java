package com.lukasz.sfgdi.services;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware,
        ApplicationContextAware
{

    @Autowired
    private GreetingService greetingService;

    public LifeCycleDemoBean() {
        System.out.println("Ctor of LifeCycleDemoBean");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("set bean factory: " + beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean name: " + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties were set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("app context was set: " + applicationContext.getApplicationName());
    }

    public void beforInit() {
        System.out.println("Before init!!!!!!!");
    }

    public void afterInit() {
        System.out.println("After init!!!!!!1");
    }
}
