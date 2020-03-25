package com.imooc.sb2.event;

/**
 * @ClassName EventNulticaster
 * @Description interface
 * @Author 47980
 * @Date 2020/3/25 19:45
 * @Version V_1.0
 **/
public interface EventNulticaster {

    void multicasterEvent(WeatherEvent event);

    void addListener(WeatherListener listener);

    void removeListener(WeatherListener listener);
}
