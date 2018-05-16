package com.jason.demo.aop.java.advice;

/**
 * 使用aop增强该类，给该类添加属性和方法
 * @author Gao
 * @date 2018/5/16 17:37
 */
public class Cat implements Animal{


    private String name;


    public void eatMounse(){
        System.out.println("猫吃老鼠 !");
    }
}
