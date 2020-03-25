package com.imooc.sb2.event;

/**
 * @ClassName Test
 * @Description
 * @Author 47980
 * @Date 2020/3/25 19:49
 * @Version V_1.0
 **/
public class Test {

    public static void main(String[] args) {
        WeatherEventMulticaster eventMulticaster = new WeatherEventMulticaster();

        RainLinstener rainLinstener = new RainLinstener();
        SnowLinstener snowLinstener = new SnowLinstener();

        eventMulticaster.addListener(rainLinstener);
        eventMulticaster.addListener(snowLinstener);

        eventMulticaster.multicasterEvent(new SnowEvent());
        eventMulticaster.multicasterEvent(new RainEvent());

        eventMulticaster.removeListener(rainLinstener);

        eventMulticaster.multicasterEvent(new SnowEvent());
        eventMulticaster.multicasterEvent(new RainEvent());
    }
}
