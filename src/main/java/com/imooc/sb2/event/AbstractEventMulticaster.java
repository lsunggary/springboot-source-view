package com.imooc.sb2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName AbstractEventMulticaster
 * @Description
 * @Author 47980
 * @Date 2020/3/25 19:46
 * @Version V_1.0
 **/
@Component
public abstract class AbstractEventMulticaster implements EventNulticaster {

    @Autowired
    private List<WeatherListener> listenerList;

    @Override
    public void multicasterEvent(WeatherEvent event) {
        doStart();
        listenerList.forEach(i-> i.onWeatherEvent(event));
        doEnd();
    }

    @Override
    public void addListener(WeatherListener listener) {
    listenerList.add(listener);
    }

    @Override
    public void removeListener(WeatherListener listener) {
        listenerList.remove(listener);
    }

    abstract void doStart();

    abstract void doEnd();
}
