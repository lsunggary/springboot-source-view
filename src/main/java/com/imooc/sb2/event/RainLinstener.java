package com.imooc.sb2.event;

import org.springframework.stereotype.Component;

/**
 * @ClassName RainLinstener
 * @Description
 * @Author 47980
 * @Date 2020/3/25 19:44
 * @Version V_1.0
 **/
@Component
public class RainLinstener implements WeatherListener {
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if (event instanceof RainEvent) {
            System.out.println("hello " + event.getWeather());
        }
    }
}
