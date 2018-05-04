package com.jason.demo.springxml;

import org.springframework.stereotype.Component;

/**
 * Mp3播放器
 */
@Component
public class Mp3Player implements IMediaPlayer {
    public Mp3Player(){
        System.out.println("Mp3（无参数构造Bean） Player init ...");
    }
    public Mp3Player(ICompactDisc iCompactDisc){
        System.out.print("Mp3(有参数构造Bean)播放器，");
        iCompactDisc.played();
    }


    @Override
    public void player() {
        System.out.println("Mp3 playing ...");
    }

    @Override
    public void playJayChou(ICompactDisc iCompactDisc){
        System.out.print("Mp3播放器，");
        iCompactDisc.played();
    }
}
