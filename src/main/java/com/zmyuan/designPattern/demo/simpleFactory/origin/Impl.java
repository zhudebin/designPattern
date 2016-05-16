package com.zmyuan.designPattern.demo.simpleFactory.origin;

/**
 * Created by zdb on 2016/5/9.
 */
public class Impl implements Api {
    @Override
    public void test1(String s) {
        System.out.println("Now in Impl. The input s=" + s);
    }
}
