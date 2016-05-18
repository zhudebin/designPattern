package com.zmyuan.designPattern.demo.singleton.example2;

/**
 * 懒汉式
 * Created by zdb on 2016/5/19.
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
