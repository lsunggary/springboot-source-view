package com.imooc.sb2.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName FirstInitializer
 * @Description
 * @Author 47980
 * @Date 2020/3/24 20:40
 * @Version V_1.0
 **/
@Order(1)
public class SecondInitializer
        implements ApplicationContextInitializer<ConfigurableApplicationContext> {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        // 获取环境变量
        ConfigurableEnvironment environment = configurableApplicationContext.getEnvironment();

        // 拼装自定义属性
        Map<String, Object> map = new HashMap<>();
        map.put("key2", "secondInitializer");
        MapPropertySource source = new MapPropertySource("secondInitializer" ,map);
        // 放入环境变量中
        environment.getPropertySources().addLast(source);
        System.out.println("run secondInitializer");
    }
}
