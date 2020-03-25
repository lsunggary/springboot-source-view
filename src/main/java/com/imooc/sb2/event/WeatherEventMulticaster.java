package com.imooc.sb2.event;

import org.springframework.stereotype.Component;

/**
 * @ClassName WeatherEventMulticaster
 * @Description
 * @Author 47980
 * @Date 2020/3/25 19:48
 * @Version V_1.0
 **/
@Component
public class WeatherEventMulticaster extends AbstractEventMulticaster {
    @Override
    void doStart() {
        System.out.println("begin broadcast weather event");
    }

    @Override
    void doEnd() {
        System.out.println("end broadcast weather event");
    }
}
