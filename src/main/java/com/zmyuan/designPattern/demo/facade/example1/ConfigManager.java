package com.zmyuan.designPattern.demo.facade.example1;

/**
 * 配置管理， 就是负责读取配置文件
 * 并把配置文件的内容设置到配置 Model 中去， 是个单例
 * Created by zdb on 2016/5/17.
 */
public class ConfigManager {

    private static ConfigManager manager = null;
    private static ConfigModel cm = null;
    private ConfigManager() {}

    public static ConfigManager getInstance() {
        if(manager == null) {
            synchronized (ConfigManager.class) {
                if(manager == null) {
                    manager = new ConfigManager();
                    cm = new ConfigModel();
                    // 读取配置文件，把值设置到 ConfigMode中去， 这里省略了
                }
                return manager;
            }
        } else {
            return manager;
        }
    }

    /**
     * 获取配置的数据
     * @return 配置的数据
     */
    public ConfigModel getConfigData() {
        return cm;
    }
}
