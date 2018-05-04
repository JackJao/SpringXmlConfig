package com.jason.demo.java2xml;

import com.jason.demo.springxml.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 把JavaConfig拆分成JavaConfig1和JavaConfig2
 */
@Configuration
public class JavaConfig1 {

    @Bean
    public IMediaPlayer mp3Player() {
        return new Mp3Player();
    }

    @Bean
    public ICompactDisc jayChouCD() {
        return new JayChouCD();
    }

    /**
     * 1.像java一样调用,调用javajayChouCD()返回对象
     * 输出:
     * Mp3(有参数构造Bean)播放器，正在播放双截棍 ...
     * Mp3(有参数构造Bean)播放器，正在播放双截棍 ...
     * @return
     */
    @Bean
    public IMediaPlayer mp3PlayerPlayingByJavaInvok(){
        return new Mp3Player(jayChouCD());
    }
}
