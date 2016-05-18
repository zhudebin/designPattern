package com.zmyuan.designPattern.demo.singleton.example3;

/**
 * 饿汉式
 * Created by zdb on 2016/5/19.
 */
public class Singleton {

    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

}
