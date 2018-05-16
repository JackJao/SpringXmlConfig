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

    /**
     * @DeclareParents注解由三部分组成：
    value属性指定了哪种类型的bean要引入该接口。在本例中，也就是所有实现
    Animal的类型。（标记符后面的加号表示是Animal的所有子类型，而
    不是Animal本身。）
    defaultImpl属性指定了为引入功能提供实现的类。在这里，我们指定的
    是addInteface提供实现。
     @DeclareParents注解所标注的静态属性指明了要引入了接口。在这里，我们所引入
     的是Encoreable接口。
     */
    @DeclareParents(value = "com.jason.demo.aop.java.advice.Animal+",defaultImpl = AddIntefaceImpl.class)
    private AddInteface addInteface;
}
