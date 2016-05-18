package com.zmyuan.designPattern.demo.singleton.example1;

/**
 * Created by zdb on 2016/5/19.
 */
public class Client {

    public static void main(String[] args) {
        AppConfig config = new AppConfig();
        System.out.println(config.getParameterA());
    }
}
