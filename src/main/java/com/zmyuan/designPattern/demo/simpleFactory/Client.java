package com.zmyuan.designPattern.demo.simpleFactory;

/**
 * Created by zdb on 2016/5/9.
 */
public class Client {

    public static void main(String[] args) {

        Api api = Factory.creatApi(1);
        api.operation("hello");

    }
}
