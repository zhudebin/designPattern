package com.zmyuan.designPattern.demo.factoryMethod.example1;

/**
 * Created by zdb on 2016/5/20.
 */
public abstract class Creator {

    protected abstract Product factoryMethod();

    public void someOperate() {
        Product product = factoryMethod();
    }

}
