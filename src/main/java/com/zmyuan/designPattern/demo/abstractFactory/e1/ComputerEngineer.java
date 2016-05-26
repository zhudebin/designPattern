package com.zmyuan.designPattern.demo.abstractFactory.e1;

/**
 * Created by zhudebin on 16/5/26.
 */
public class ComputerEngineer {

    private CPUApi cpu = null;
    private MainboardApi mainboard = null;

    public void makeComputer(int cpuType, int mainboardType) {
        // 准备硬件
        prepareHardwares(cpuType, mainboardType);

        // 安装

        // 测试

        // 交付
    }

    public void prepareHardwares(int cpuType, int mainboardType) {
        cpu = CPUFactory.createCPU(cpuType);
        mainboard = MainboardFactory.createMainboard(mainboardType);

        // 测试一下

        cpu.calculate();
        mainboard.installCPU();
    }
}
