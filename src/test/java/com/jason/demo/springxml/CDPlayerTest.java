package com.jason.demo.springxml;

import com.jason.demo.springxml.ICompactDisc;
import com.jason.demo.springxml.IMediaPlayer;
import com.jason.demo.springxml.config.JavaConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * JavaConfig中有多少个bean就会初始化多少个
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JavaConfig.class)
public class CDPlayerTest {

    /**
     * @Resource默认按照beanName匹配bean，名字
     */
    @Resource
    private IMediaPlayer mp3Player;

    @Resource
    private IMediaPlayer mp4Player;

    @Resource
    private ICompactDisc jayChouCD;

    @Resource
    private IMediaPlayer mp3PlayerPlayingByJavaInvok;

    @Resource
    private IMediaPlayer mp3PlayerPlayingByParamsDi;

    /**
     * 测试JavaConfig中5个bean是否null
     */
    @Test
    public void isNotNull(){
        Assert.assertNotNull(mp3Player);
        Assert.assertNotNull(mp4Player);
        Assert.assertNotNull(jayChouCD);
        /**
         * 测试创建bean的时候，使用java方式传入对象
         */
        Assert.assertNotNull(mp3PlayerPlayingByJavaInvok);
        /**
         * 测试创建bean的时候，自动匹配已有的bean，传入对象
         */
        Assert.assertNotNull(mp3PlayerPlayingByParamsDi);
    }

    /**
     * 测试MP3 播放器播放功能
     */
   @Test
    public void mp3Playing(){
       System.out.println("======================华丽的分割线==================");
       mp3Player.player();
    }


    /**
     * 使用MP3
     * 播放双截棍
     */
    @Test
    public void mp3PlayerPlayingShuangJieGun(){
        System.out.println("======================华丽的分割线==================");
        mp3Player.playJayChou(jayChouCD);
    }

    /**
     * 测试MP4 播放器播放功能
     */
    @Test
    public void mp4Playing(){
        System.out.println("======================华丽的分割线==================");
        mp4Player.player();
    }

    /**
     * 使用MP4
     * 播放双截棍
     */
    @Test
    public void mp4PlayerPlayingShuangJieGun(){
        System.out.println("======================华丽的分割线==================");
        mp4Player.playJayChou(jayChouCD);
    }

    /**
     * 播放周杰伦的CD
     */
    @Test
    public void jayChouCDPlayed(){
        System.out.println("======================华丽的分割线==================");
        jayChouCD.played();
    }
}
