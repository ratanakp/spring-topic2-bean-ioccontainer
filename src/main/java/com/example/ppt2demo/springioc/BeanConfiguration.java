package com.example.ppt2demo.springioc;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfiguration {

//    @Bean
//    public Drawing drawing() {
//        return new Drawing();
//    }


    @Bean
    public Circle circle() {
        return new Circle();
    }


    @Bean
    public Triangle triangle() {
        return new Triangle();
    }




}
