package com.zmyuan.designPattern.demo.facade.example1;

/**
 * Created by zdb on 2016/5/17.
 */
public class Presentation {

    public void generate() {
        // 1. 从配置管理里面获取相应的配置信息
        ConfigModel cm = ConfigManager.getInstance().getConfigData();
        if(cm.isNeedGenPresentation()) {
            // 2. 按照要求去生成相应的代码，并保存成文件
            System.out.println("正在生成表现层的代码...");
        }
    }

}
