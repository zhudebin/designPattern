package com.zmyuan.designPattern.demo.factoryMethod.example1;

/**
 * Created by zdb on 2016/5/20.
 */
public class ConcreteCreator extends  Creator {
    @Override
    protected Product factoryMethod() {
        return new ConcreteProduct();
    }
}
