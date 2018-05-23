package com.example.ppt2demo;

import com.example.ppt2demo.springioc.Drawing;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PpT2DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(PpT2DemoApplication.class, args);

        Drawing drawing1  = context.getBean("drawing", Drawing.class);

        drawing1.drawShape();
        drawing1.setDesc("desc 1");

        Drawing drawing2  = context.getBean("drawing", Drawing.class);

        drawing2.drawShape();
        drawing2.setDesc("desc 2");


        System.out.println("1. " + drawing1.getDesc());
        System.out.println("2. " + drawing2.getDesc());

        ((ConfigurableApplicationContext) context).close();

    }
}
