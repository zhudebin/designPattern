package com.zmyuan.designPattern.demo.singleton.example4;

/**
 * Created by zdb on 2016/5/19.
 */
public class Singleton {

    private static class  SingletonHolder {
        /**
         * 静态初始化器， 由JVM来保证线程安全
         */
        private static Singleton instance = new Singleton();
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
}
