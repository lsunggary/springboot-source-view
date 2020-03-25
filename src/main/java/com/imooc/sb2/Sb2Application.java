package com.imooc.sb2;

import com.imooc.sb2.initializer.SecondInitializer;
import com.imooc.sb2.listener.SecondListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;

import javax.swing.*;

@SpringBootApplication
public class Sb2Application {

    public static void main(String[] args) {
        SpringApplication.run(Sb2Application.class, args);
//        SpringApplication springApplication = new SpringApplication(Sb2Application.class);
////         直接把自定义的初始化器加入当前application的initializer列队
//        springApplication.addInitializers(new SecondInitializer());
//        springApplication.run(args);
//        SpringApplication springApplication = new SpringApplication(Sb2Application.class);
//        springApplication.addListeners(new SecondListener());
//        springApplication.run();
    }

}
