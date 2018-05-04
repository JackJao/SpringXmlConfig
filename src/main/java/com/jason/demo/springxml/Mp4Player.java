package com.jason.demo.springxml;

/**
 * Mp4播放器
 */
public class Mp4Player implements IMediaPlayer {
    @Override
    public void player() {
        System.out.println("Mp4 playing...");
    }

    @Override
    public void playJayChou(ICompactDisc iCompactDisc) {
        System.out.print("Mp4播放器，");
        iCompactDisc.played();;
    }

    public Mp4Player(){
        System.out.println("Mp4（无参数构造Bean） Player init ...");
    }
}
