package com.stackroute.domain;

import com.stackroute.BeanLifecycleDemoBean;
import com.stackroute.BeanPostProcessorDemoBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan(basePackages = "com.stackroute.domain")
public class BeanConfig {

    @Bean
    @Scope("prototype")
    public Movie movie(){
        Movie movie=new Movie();
        movie.setActor(actor());
        return movie;
    }

    @Bean
    public Actor actor(){
        Actor actor=new Actor();
        actor.setName("Raj");
        actor.setGender("Male");
        actor.setAge(68);
          return actor;
    }
    @Bean
    public Actor actor1(){
        Actor actor1=new Actor();
        actor1.setName("Raj");
        actor1.setGender("Male");
        actor1.setAge(68);
        return actor1;
    }

    @Bean
    public Actor actor2() {
        Actor actor2 = new Actor();
        actor2.setName("Raj");
        actor2.setGender("Male");
        actor2.setAge(68);
        return actor2;
    }

    @Bean
    public  BeanLifecycleDemoBean beanLifecycleDemoBean(){
        BeanLifecycleDemoBean beanLifecycleDemoBean=new BeanLifecycleDemoBean();
        return  beanLifecycleDemoBean;
    }

    @Bean
    public BeanPostProcessorDemoBean beanPostProcessorDemoBean(){
        BeanPostProcessorDemoBean beanPostProcessorDemoBean=new BeanPostProcessorDemoBean();
        return beanPostProcessorDemoBean;
    }
}
