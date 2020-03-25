package com.imooc.sb2.event;

/**
 * @ClassName SnowLinstener
 * @Description
 * @Author 47980
 * @Date 2020/3/25 19:43
 * @Version V_1.0
 **/
public class SnowLinstener implements WeatherListener{
    @Override
    public void onWeatherEvent(WeatherEvent event) {
        if (event instanceof SnowEvent) {
            System.out.println("hello " + event.getWeather());
        }
    }
}
