package com.jason.demo.aop.aspectj;

/**
 * 使用AspectJ插件编写aspect语法的切点
 * 详情见书147页4.5章节
 * 参考：https://blog.csdn.net/u012523359/article/details/72851479
 * @author Gao
 * @date 2018/5/28 16:16
 */
public aspect CriticAspect {
    public CriticAspect(){}

    pointcut performance():execution(* perform(..));

}
