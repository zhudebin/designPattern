package com.zmyuan.designPattern.demo.singleton.example1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by zdb on 2016/5/19.
 */
public class AppConfig {

    private String parameterA;

    public String getParameterA() {
        return parameterA;
    }

    public void setParameterA(String parameterA) {
        this.parameterA = parameterA;
    }

    public AppConfig() {
    }

    private void readConfig() {
        Properties p = new Properties();
        try(InputStream is = AppConfig.class.getResourceAsStream("AppConfig.properties"))
        {
            this.parameterA = p.getProperty("paramA");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
