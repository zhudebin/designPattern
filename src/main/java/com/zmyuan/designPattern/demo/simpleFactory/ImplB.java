package com.zmyuan.designPattern.demo.simpleFactory;

/**
 * Created by zdb on 2016/5/9.
 */
public class ImplB implements Api {
    @Override
    public void operation(String s) {
        System.out.println("ImplB s = " + s);
    }
}
