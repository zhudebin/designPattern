package com.zmyuan.designPattern.demo.adapter.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zdb on 2016/5/17.
 */
public class Client {

    public static void main(String[] args) {
        // 准备日志内容， 也就是测试的数据
        LogModel lm1 = new LogModel();
        lm1.setLogId("001");
        lm1.setOperateUser("admin");
        lm1.setOperateTime("2012-02-02 10:10:10");
        lm1.setLogContent("这是一个测试");

        List<LogModel> list = new ArrayList<>();
        list.add(lm1);

        // 创建操作日志文件的对象
        LogFileOperateApi api = new LogFileOperate("");
        // 保存日志文件
        api.writeLogFile(list);

        // 读取日志文件的内容
        List<LogModel> readLog = api.readLogFile();
        System.out.println("readLog=" + readLog);
    }

}