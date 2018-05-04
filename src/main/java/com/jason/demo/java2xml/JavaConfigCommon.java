package com.jason.demo.java2xml;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * 把分开的配置整合在一起,纯java方式,演示配置一分为二，合二为一的方式
 * 这里的import没有顺序区分
 */
@Configuration
//把2个spring的java配置整合在一起
@Import(value = {JavaConfig1.class,JavaConfig2.class})
public class JavaConfigCommon {
}

/**
 * 一、把spring的java配置和xml配置合在一起使用
 */
@Configuration
@Import(JavaConfig1.class)
@ImportResource({"classpath:applicationContext.xml"})
/*public */class JavaConfigCommon2 {
}


