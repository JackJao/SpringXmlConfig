package com.jason.demo.aop.java.advice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 显示的声明bean
 * @author Gao
 * @date 2018/5/16 17:42
 */
@Configuration
@EnableAspectJAutoProxy
public class Config {

    @Bean
    public PointCut pointCut(){
        return new PointCut();
    }

    @Bean
    public Animal animal(){
        return new Dog();
    }
}
