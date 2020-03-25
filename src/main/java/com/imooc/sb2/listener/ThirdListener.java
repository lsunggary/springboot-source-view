package com.imooc.sb2.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;

/**
 * @ClassName ThirdListener
 * @Description
 * @Author 47980
 * @Date 2020/3/25 20:53
 * @Version V_1.0
 **/
@Order(3)
public class ThirdListener implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("hello third");
    }
}
