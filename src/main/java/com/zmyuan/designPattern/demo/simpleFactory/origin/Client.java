package com.zmyuan.designPattern.demo.simpleFactory.origin;

/**
 * Created by zdb on 2016/5/9.
 */
public class Client {

    public static void main(String[] args) {
        Api api = new Impl();
        api.test1("哈哈，不要紧张， 只是个测试而已");
    }
}
