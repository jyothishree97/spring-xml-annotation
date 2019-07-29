package com.stackroute.domain;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
//@ComponentScan(basePackages = "com.stackroute.domain")
public class BeanConfig {

    @Bean
    @Scope(value="prototype")
    public Movie movie(){
        Movie movie=new Movie();
        movie.setActor(actor());
        return movie;
    }

    @Bean
    public Actor actor(){
        Actor actor=new Actor("Raj","Male",68);
          return actor;
    }
    @Bean
    public Actor actor1(){
        Actor actor=new Actor("kumar","Male",68);
        return actor;
    }

    @Bean
    public Actor actor2(){
        Actor actor=new Actor("Vishnu","Male",68);
        return actor;
    }
}
