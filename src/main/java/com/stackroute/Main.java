package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.BeanConfig;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 */


public class Main {
    public static void main(String[] args) {

//        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//        Movie movie= xmlBeanFactory.getBean("movie1",Movie.class);

        ApplicationContext applicationcontext = new AnnotationConfigApplicationContext(BeanConfig.class);
        Movie movie = (Movie) applicationcontext.getBean("movie");

        Movie movie1=(Movie) applicationcontext.getBean("movie");
        System.out.println(movie);

        ((AbstractApplicationContext)applicationcontext).registerShutdownHook();

        Actor actor=(Actor) applicationcontext.getBean("actor");
        System.out.println(actor);
        Actor actor1=(Actor) applicationcontext.getBean("actor1");
        System.out.println(actor1);
        Actor actor2=(Actor) applicationcontext.getBean("actor2");
        System.out.println(actor2);


        System.out.println(actor==actor1);
        System.out.println(movie==movie1);

    }
}
