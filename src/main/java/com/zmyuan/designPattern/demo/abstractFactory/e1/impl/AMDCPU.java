package com.zmyuan.designPattern.demo.abstractFactory.e1.impl;

import com.zmyuan.designPattern.demo.abstractFactory.e1.CPUApi;

/**
 * Created by zhudebin on 16/5/26.
 */
public class AMDCPU implements CPUApi {

    private int pins = 0;

    public AMDCPU(int pins) {
        this.pins = pins;
    }

    @Override public void calculate() {
        System.out.println("now in AMD cpu, pins=" + pins);
    }
}
