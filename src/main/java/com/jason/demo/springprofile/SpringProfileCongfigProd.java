package com.jason.demo.springprofile;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

/**
 * java方式的profile配置：
 * 第一种，多个config类使用注解@Profile("dev"),该注解使用在类上，对该类的所有bean成员有效
 * 第二种，一个配置类，每个bean单独使用@Profile("dev")注解只对该bean有效，没有注解的是立即生成bean
 * @author Gao
 * @date 2018/5/7 11:56
 */
@Profile("prod")
public class SpringProfileCongfigProd {
    @Bean
    public DataSource dataSource(){
        return new DruidDataSource();
    }

    @Bean
    public DataSource dataSource2(){
        return new DruidDataSource();
    }
}
