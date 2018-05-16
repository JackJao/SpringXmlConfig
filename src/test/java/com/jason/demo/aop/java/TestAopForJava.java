package com.jason.demo.aop.java;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author Gao
 * @date 2018/5/16 14:36
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AopConfig.class})
public class TestAopForJava {

    @Resource
    private ICompactDisc blankDisc;

    @Resource
    private AopPointCut aopPointCut;

    @Test
    public  void testAopPointCut(){
        /**
         * 播放磁道：夜曲 1次
         * 播放磁道：发如雪 2次
         * 播放磁道：青花瓷 3次
         * 播放磁道：一路向北 4次
         * 播放磁道：夜第六章 5次
         */
        blankDisc.trackCount(0);
        blankDisc.trackCount(1);
        blankDisc.trackCount(1);
        blankDisc.trackCount(2);
        blankDisc.trackCount(2);
        blankDisc.trackCount(2);
        blankDisc.trackCount(3);
        blankDisc.trackCount(3);
        blankDisc.trackCount(3);
        blankDisc.trackCount(3);
        blankDisc.trackCount(4);
        blankDisc.trackCount(4);
        blankDisc.trackCount(4);
        blankDisc.trackCount(4);
        blankDisc.trackCount(4);

        /**
         * 统计播放次数和期望值是否一样
         */
       Assert.assertEquals(1,aopPointCut.getCount(0));
       Assert.assertEquals(2,aopPointCut.getCount(1));
       Assert.assertEquals(3,aopPointCut.getCount(2));
       Assert.assertEquals(4,aopPointCut.getCount(3));
       Assert.assertEquals(5,aopPointCut.getCount(4));

    }
}
