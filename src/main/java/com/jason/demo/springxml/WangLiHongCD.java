package com.jason.demo.springxml;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Gao
 * @date 2018/5/3 14:56
 */
public class WangLiHongCD implements ICompactDisc{
    private String title;
    private String name;
    private List<String> mutilUser;
    public WangLiHongCD(String title,String name){
        this.title = title;
        this.name = name;
    }
    public WangLiHongCD(){
    }
    @Override
    public void played() {
        System.out.println("播放王力宏的，"+title+"...听众："+name);
        if(mutilUser==null || mutilUser.isEmpty()){
            return ;
        }
        System.out.println("还有以下的很多听众：");
        for (String user:mutilUser ) {
            System.out.println(user);
        }
    }

    @Override
    public void trackCount(int tranck) {
        System.out.println("不看这个，暂时没有意义");
    }

    public  void setTitle(String title){
        this.title = title;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setMutilUser(List mutilUser) {
        this.mutilUser = mutilUser;
    }
}
