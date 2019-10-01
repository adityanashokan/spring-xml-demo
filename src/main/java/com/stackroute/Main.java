package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args){
        //Using XmlBeanFactory
        BeanFactory factory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
        System.out.println("Bean File Loaded using XmlBeanFactory");

        Movie m = (Movie) factory.getBean("movie1",Movie.class);
        m.getActorDetails();

        //Using ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Bean File Loaded using ApplicationContext");

        Movie m2 = (Movie) context.getBean("movie2",Movie.class);
        System.out.println(m2.getActorDetails());

        //Using BeanDefinitionRegistry and BeanDefinitionReader
        BeanDefinitionRegistry registry = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        BeanDefinitionReader reader = new XmlBeanDefinitionReader(registry);
        BeanFactory factory1 = (BeanFactory) reader.getRegistry();
        System.out.println("Bean File Loaded using BeanDefinitionRegistry and BeanDefinitionReader");


        Movie m3 = (Movie) factory1.getBean("movie3", Movie.class);
        System.out.println(m3.getActorDetails());
    }
}
