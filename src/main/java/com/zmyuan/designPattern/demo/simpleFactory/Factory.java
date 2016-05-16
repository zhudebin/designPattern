package com.zmyuan.designPattern.demo.simpleFactory;

/**
 * Created by zdb on 2016/5/9.
 */
public class Factory {

    public static Api creatApi(int condition) {
        Api api = null;
        if(condition ==1) {
            api = new ImplA();
        } else if(condition == 2) {
            api = new ImplB();
        }
        return api;
    }

}
