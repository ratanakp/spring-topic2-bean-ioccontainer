package com.example.ppt2demo.springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.lang.annotation.Target;

@Component
@Scope(scopeName = "prototype")
public class Drawing {

    private String desc;

    private Shape shape;


    public Drawing() {
    }

    @Autowired
    public Drawing(@Qualifier("triangle") Shape shape) {
        this.shape = shape;
    }


    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void drawShape() {
        this.shape.draw();
    }


    @PostConstruct
    public void init() {
        System.out.println("this bean is going to be init...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("this bean is going to be destroy...");
    }


}
