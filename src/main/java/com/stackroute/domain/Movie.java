package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {
    private Actor actor;
    private ApplicationContext context;
    private BeanFactory factory;
    public Movie(Actor actor){
        this.actor = actor;
    }

    public Movie() {
    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException
    {
        this.context = context;
        System.out.println(context.getBean("actor"));
    }


    @Override
    public void setBeanName(String beanName)
    {
        System.out.println("Bean name is: "+beanName);
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void display(){
        actor.display();
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.factory = beanFactory;
        System.out.println(beanFactory.getBean("actor"));
    }
}
