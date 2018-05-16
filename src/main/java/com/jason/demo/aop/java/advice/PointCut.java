package com.jason.demo.aop.java.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author Gao
 * @date 2018/5/16 17:42
 */
@Aspect
public class PointCut {

    @DeclareParents(value = "com.jason.demo.aop.java.advice.Animal+",defaultImpl = AddIntefaceImpl.class)
    private AddInteface addInteface;
}
