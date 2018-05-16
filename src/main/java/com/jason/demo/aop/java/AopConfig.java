package com.jason.demo.aop.java;

import com.jason.demo.springxml.ICompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gao
 * @date 2018/5/11 15:46
 */
@Configuration
@EnableAspectJAutoProxy
public class AopConfig {

    /**
     * 普通的bean
     * @return
     */
    @Bean
    public ICompactDisc blankDisc(){
        List<String> tracks = new ArrayList<>();
        tracks.add("夜曲");
        tracks.add("发如雪");
        tracks.add("青花瓷");
        tracks.add("一路向北");
        tracks.add("夜第六章");
        BlankDisc bd = new BlankDisc("十一月的萧邦","周杰伦",tracks);
        return bd;
    }

    /**
     * 申明切点的bean
     * @return
     */
    @Bean
    public AopPointCut aopPointCut(){
        return new AopPointCut();
    }
}
