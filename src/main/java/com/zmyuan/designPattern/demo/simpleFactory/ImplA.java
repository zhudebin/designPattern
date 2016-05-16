package com.zmyuan.designPattern.demo.simpleFactory;


/**
 * Created by zdb on 2016/5/9.
 */
public class ImplA implements Api {
    @Override
    public void operation(String s) {
        System.out.println("ImplA s = " + s);
    }
}
