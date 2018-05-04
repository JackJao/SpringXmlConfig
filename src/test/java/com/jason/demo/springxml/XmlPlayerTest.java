package com.jason.demo.springxml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Description: TODO
 * @Author Gao
 * @Date 2018/5/3 15:10
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-core.xml"})
public class XmlPlayerTest {

    @Resource
    private ICompactDisc jayChouCDBeanId;

    @Resource
    private IMediaPlayer mp3Player;

    @Resource
    private ICompactDisc wangLiHongCDBeanId;

    @Resource
    private ICompactDisc wangLiHongCDBeanIdByProperties;

    /**
     * 双截棍正在(被)播放 ...
     */
    @Test
    public void test(){
        System.out.println("======================华丽的分割线======================");
        jayChouCDBeanId.played();
    }

    @Test
    public void test1(){
        System.out.println("======================华丽的分割线======================");
        mp3Player.player();
        mp3Player.playJayChou(jayChouCDBeanId);
    }

    @Test
    public void test3(){
        System.out.println("======================华丽的分割线======================");
        wangLiHongCDBeanId.played();
    }

    @Test
    public void test4(){
        System.out.println("======================华丽的分割线======================");
        wangLiHongCDBeanIdByProperties.played();
    }
}
