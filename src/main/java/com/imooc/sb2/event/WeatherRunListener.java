package com.imooc.sb2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName WeatherRunListener
 * @Description
 * @Author 47980
 * @Date 2020/3/25 20:12
 * @Version V_1.0
 **/
@Component
public class WeatherRunListener {

    @Autowired
    private WeatherEventMulticaster eventMulticaster;

    public void snow() {
        eventMulticaster.multicasterEvent(new SnowEvent());
    }

    public void rain() {
        eventMulticaster.multicasterEvent(new RainEvent());
    }
}
