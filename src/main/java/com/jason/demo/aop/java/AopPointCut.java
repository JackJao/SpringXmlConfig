package com.jason.demo.aop.java;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * 基于注解的aop配置，切点
 * @author Gao
 * @date 2018/5/11 15:48
 */
@Aspect
public class AopPointCut {
    private Map<Integer,Integer> counts = new HashMap<>();

    /**
     * 声明切点表达式，带入参数
     */
    @Pointcut("execution(* com.jason.demo.aop.java.BlankDisc.trackCount(int)) && args(number)")
    private void el(int number){

    }

    @Before("el(count)")
    public void countTrack(int count){
        int currentCount = getCount(count);
        counts.put(count,currentCount+1);
    }


    public int getCount(int count){
        return counts.containsKey(count)?counts.get(count):0;
    }
}
