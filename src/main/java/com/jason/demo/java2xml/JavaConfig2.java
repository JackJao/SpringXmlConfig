package com.jason.demo.java2xml;

import com.jason.demo.springxml.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 把JavaConfig拆分成JavaConfig1和JavaConfig2
 */
@Configuration
//@Import({JavaConfig1.class})//bean mp3PlayerPlayingByParamsDi 依赖JavaConfig1中的bean，可用这种方式，不推荐，推荐使用JavaConfigCommon方式组合自己需要使用的bean的公共配置
public class JavaConfig2 {

    @Bean
    public IMediaPlayer mp4Player() {
        return new Mp4Player();
    }
    /**
     * 2.这两种(1,2)一样,这个更直观(参数注入)
     * 输出:
     * Mp3(有参数构造Bean)播放器，正在播放双截棍 ...
     * Mp3(有参数构造Bean)播放器，正在播放双截棍 ...
     * @return
     */
    @Bean
    public IMediaPlayer mp3PlayerPlayingByParamsDi(ICompactDisc jayChouCD){//======这里虽然idea检测提示不能装配该bean，但是在JavaConfigCommon中已经装配了他的依赖
        return new Mp3Player(jayChouCD);
    }

}
