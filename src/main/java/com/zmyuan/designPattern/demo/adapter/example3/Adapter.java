package com.zmyuan.designPattern.demo.adapter.example3;

/**
 * Created by zdb on 2016/5/17.
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
