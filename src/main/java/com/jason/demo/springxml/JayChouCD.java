package com.jason.demo.springxml;

import org.springframework.stereotype.Component;

/**
 * 周杰伦的CD
 */
@Component
public class JayChouCD implements ICompactDisc {

    public JayChouCD() {
        System.out.println("周杰伦的CD（无参数构造Bean） init ...");
    }

    @Override
    public void played() {
        System.out.println("双截棍正在(被)播放 ...");
    }

    @Override
    public void trackCount(int tranck) {
        System.out.println("不看这里，暂时没有意义");
    }
}
