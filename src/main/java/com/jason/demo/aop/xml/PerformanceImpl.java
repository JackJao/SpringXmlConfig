package com.jason.demo.aop.xml;

/**
 * @author Gao
 * @date 2018/5/17 11:39
 */
public class PerformanceImpl implements Performance{
    @Override
    public void perform() {
        System.out.println("正在执行perform自己.....");
    }

    @Override
    public void perform2() {
        System.out.println("正在执行perform2自己......");
    }

    @Override
    public void perform3(int para) {
        System.out.println("正在执行perform3自己......para="+para);
    }
}
