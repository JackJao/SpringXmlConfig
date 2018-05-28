package com.jason.demo.aop.xml.advice;

import com.jason.demo.aop.java.advice.Animal;
import com.jason.demo.aop.java.advice.Config;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Gao
 * @date 2018/5/16 14:36
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:aop/spring-advice.xml")
public class TestAopForXml {

    @Resource
    private Animal animal;

    @Test
    public  void testAopPointCut(){
        Class<? extends Animal> aClass = animal.getClass();
        System.out.println(aClass+"<====class");
        //获取公共成员（包含接口和超类中的）
        Method[] methods = aClass.getMethods();
        //获取所有成员(包含非公共的)
        //Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method me:methods){
            //System.out.println(me.getName());
        }
        //====获取自己添加的方法和属性
        try {
            Method sleep = aClass.getMethod("sleep", null);
            System.out.println(sleep.getName()+"<======新增的method");
            Field common = aClass.getField("COMMON");
            System.out.println(common.getName()+"<============新增的字段");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }catch (NoSuchFieldException e){
            e.printStackTrace();
        }
    }
}
