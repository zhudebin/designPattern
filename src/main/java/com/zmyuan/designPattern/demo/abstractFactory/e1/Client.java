package com.zmyuan.designPattern.demo.abstractFactory.e1;

/**
 * Created by zhudebin on 16/5/26.
 */
public class Client {

    public static void main(String[] args) {

        ComputerEngineer engineer = new ComputerEngineer();
        engineer.makeComputer(1, 1);

    }
}
