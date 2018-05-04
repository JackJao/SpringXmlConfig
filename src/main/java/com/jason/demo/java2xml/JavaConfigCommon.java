package com.jason.demo.java2xml;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 把分开的配置整合在一起,纯java方式,演示配置一分为二，合二为一的方式
 * 这里的import没有顺序区分
 */
@Configuration
@Import(value = {JavaConfig1.class,JavaConfig2.class})
public class JavaConfigCommon {
}
