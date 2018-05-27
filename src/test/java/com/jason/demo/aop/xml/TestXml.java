package com.jason.demo.aop.xml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author Gao
 * @date 2018/5/17 11:33
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:aop/spring-core.xml")
public class TestXml {

    @Resource
    private Performance performance;
    @Test
    public void testAspect(){
        performance.perform();
        System.out.println("--------------------------华丽的分割线------------------------");
        performance.perform2();
    }
    @Test
    public void testAspect2(){
        performance.perform3(22);
    }

}
