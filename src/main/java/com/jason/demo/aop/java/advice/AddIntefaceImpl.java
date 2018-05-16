package com.jason.demo.aop.java.advice;

/**
 * @author Gao
 * @date 2018/5/16 17:55
 */
public class AddIntefaceImpl implements AddInteface{
    @Override
    public void sleep() {
        System.out.println("不管什么动物都要睡觉！");
    }
}
