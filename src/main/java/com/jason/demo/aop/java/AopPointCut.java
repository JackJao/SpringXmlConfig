package com.jason.demo.aop.java;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * 基于注解的aop配置，切点
 * 切点和通知同时只能有一个
 * @author Gao
 * @date 2018/5/11 15:48
 */
@Aspect
public class AopPointCut {
    private Map<Integer,Integer> counts = new HashMap<>();

    /**
     * 声明切点表达式，带入参数
     */
    @Pointcut("execution(* com.jason.demo.aop.java.BlankDisc.trackCount(Integer)) && args(count)")
    private void el(Integer count){

    }

   /* @Pointcut("execution(* com.jason.demo.aop.java.BlankDisc.trackCount(..))")
    private void el(){

    }*/

    @Before("el(count)")
    public void countTrack(Integer count){
        int currentCount = getCount(count);
        counts.put(count,currentCount+1);
    }

    /**
     * 不能这样使用：Caused by: java.lang.IllegalArgumentException: ProceedingJoinPoint is only supported for around advice
     * 只支持环绕通知
     */
   /* @Before("el(count)")
    public void countTrack(ProceedingJoinPoint proceedingJoinPoint,Integer count){
        int currentCount = getCount(count);
        counts.put(count,currentCount+1);
    }*/

    /**
     * 调用参数不做修改
     */
    /*@Around("el()")
    public void around(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("前置");
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("异常");
        }
        System.out.println("后置");
    }*/

    /**
     * 环绕通知示例,附带修改参数值
     */
    @Around("el(count)")
    public void aroundByParams(ProceedingJoinPoint proceedingJoinPoint,Integer count){
        System.out.println("前置==〉磁道编号"+count);
        try {
            //磁道计算跳过第一个,这里改变了要传入目标对象的参数的值，直接跳过“夜曲”，该“夜曲”未被播放
            count = count + 1;
            proceedingJoinPoint.proceed(new Object[]{count});
            //获取参数=========可做其它业务操作
            Object[] args = proceedingJoinPoint.getArgs();
            //获取目标对象=======可做其他业务操作
            proceedingJoinPoint.getTarget();
            //调用目标，不做修改
            //proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("异常==>磁道编号"+count);
        }
        System.out.println("后置==>磁道编号"+count);
    }

    public int getCount(int count){
        return counts.containsKey(count)?counts.get(count):0;
    }
}
