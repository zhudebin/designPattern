package com.zmyuan.designPattern.demo.adapter.example3;

/**
 * 已经存在的接口， 这个接口需要被适配
 *
 * Created by zdb on 2016/5/17.
 */
public class Adaptee {

    public void specificRequest() {
        System.out.println("---- adaptee ----");
    }
}
