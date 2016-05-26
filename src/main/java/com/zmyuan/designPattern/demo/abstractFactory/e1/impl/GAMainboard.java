package com.zmyuan.designPattern.demo.abstractFactory.e1.impl;

import com.zmyuan.designPattern.demo.abstractFactory.e1.MainboardApi;

/**
 * Created by zhudebin on 16/5/26.
 */
public class GAMainboard implements MainboardApi {

    private int cpuHoles;

    public GAMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override public void installCPU() {
        System.out.println("now in GA mainboard, cpuHoles=" + cpuHoles);
    }
}
