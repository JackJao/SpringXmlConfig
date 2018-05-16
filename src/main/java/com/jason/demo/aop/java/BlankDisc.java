package com.jason.demo.aop.java;

import com.jason.demo.springxml.ICompactDisc;

import java.util.List;

/**
 * 空白磁盘：
 * @author Gao
 * @date 2018/5/16 12:23
 */
public class BlankDisc implements ICompactDisc{
    /**
     * 标题
     */
    private String title;
    /**
     * 艺术家（作者）
     */
    private String artist;
    /**
     * 磁道
     */
    private List<String> tracks;

    /**
     * 默认构造
     */
    public BlankDisc() {
        super();
    }

    /**
     * 初始化构造
     * @param title
     * @param artist
     * @param tracks
     */
    public BlankDisc(String title, String artist, List<String> tracks) {
        super();
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    @Override
    public void played() {
        System.out.println("正在播放【"+artist+"】的【"+title+"】");
        for(String track:tracks){
            System.out.println("-磁道："+track);
        }
    }
    @Override
    public void trackCount(int trackCount){
        System.out.println("播放磁道："+tracks.get(trackCount));
    }
}
