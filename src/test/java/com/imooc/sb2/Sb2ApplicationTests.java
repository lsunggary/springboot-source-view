package com.imooc.sb2;

import com.imooc.sb2.event.WeatherEventMulticaster;
import com.imooc.sb2.event.WeatherRunListener;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class Sb2ApplicationTests {

    @Autowired
    private WeatherRunListener weatherRunListener;

    @Test
    void contextLoads() {
    }

    @Test
    public void testEvent() {
        weatherRunListener.rain();
        weatherRunListener.snow();
    }

}
