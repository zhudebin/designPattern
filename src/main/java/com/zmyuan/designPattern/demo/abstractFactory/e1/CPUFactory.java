package com.zmyuan.designPattern.demo.abstractFactory.e1;

import com.zmyuan.designPattern.demo.abstractFactory.e1.impl.AMDCPU;
import com.zmyuan.designPattern.demo.abstractFactory.e1.impl.IntelCPU;

/**
 * Created by zhudebin on 16/5/26.
 */
public class CPUFactory {

    public static CPUApi createCPU(int type) {
        switch (type) {
        case 1:
            return new IntelCPU(1156);
        case 2:
            return new AMDCPU(939);
        default:
            throw new RuntimeException("没有这种CPU,型号为:" + type);
        }
    }

}
