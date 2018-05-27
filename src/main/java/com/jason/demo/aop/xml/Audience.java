package com.jason.demo.aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 四个方法描述了，看表演的四种情况
 * 使用xml方式配置该bean，使它成为切面
 * @author Gao
 * @date 2018/5/17 10:19
 */
public class Audience {

    /**
     * 看表演前，手机关机或静音
     */
    public void silenceCellPhones(){
        System.out.println("手机关机");
    }

    /**
     * 然后坐下
     */
    public void takeSeats(){
        System.out.println("坐下");
    }

    /**
     * 表演精彩，鼓掌
     */
    public void appLause(){
        System.out.println("鼓掌");
    }

    /**
     *  表演异常不精彩，退票
     */
    public  void demandRefund(){
        System.out.println("退票");
    }

    /**
     * 环绕通知
     * @param proceedingJoinPoint
     */
    public void watchPerformance(ProceedingJoinPoint proceedingJoinPoint){

        try {
            //表演前
            silenceCellPhones();
            takeSeats();
            proceedingJoinPoint.proceed();
            //表演后
            appLause();
        } catch (Throwable throwable) {
            //表演异样
            demandRefund();
            throwable.printStackTrace();
        }
    }

    /**
     * 环绕通知
     * @param proceedingJoinPoint
     */
    public void watchPerformance2(ProceedingJoinPoint proceedingJoinPoint){

        try {
            //表演前
            silenceCellPhones();
            takeSeats();
            Object[] args = proceedingJoinPoint.getArgs();
            for (Object obj:args) {
                System.out.println(obj.getClass().getName());
                Integer obj1 = (Integer) obj;
                obj1 = obj1+10;
                obj = obj1;
            }
            proceedingJoinPoint.proceed();
            //表演后
            appLause();
        } catch (Throwable throwable) {
            //表演异样
            demandRefund();
            throwable.printStackTrace();
        }
    }
}
