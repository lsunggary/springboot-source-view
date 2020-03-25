package com.imooc.sb2.event;

/**
 * @ClassName SnowEvent
 * @Description
 * @Author 47980
 * @Date 2020/3/25 19:41
 * @Version V_1.0
 **/
public class SnowEvent extends WeatherEvent {
    @Override
    public String getWeather() {
        return "snow";
    }
}
