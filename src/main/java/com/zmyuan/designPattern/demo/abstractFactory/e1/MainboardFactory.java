package com.zmyuan.designPattern.demo.abstractFactory.e1;

import com.zmyuan.designPattern.demo.abstractFactory.e1.impl.GAMainboard;
import com.zmyuan.designPattern.demo.abstractFactory.e1.impl.MSIMainboard;

/**
 * Created by zhudebin on 16/5/26.
 */
public class MainboardFactory {

    public static MainboardApi createMainboard(int type) {
        switch (type) {
        case 1:
            return new GAMainboard(1156);
        case 2:
            return new MSIMainboard(939);
        default:
            throw new RuntimeException("没有这种类型的主板,类型为:" + type);
        }
    }

}
