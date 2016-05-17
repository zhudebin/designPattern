package com.zmyuan.designPattern.demo.adapter.example4;

import com.zmyuan.designPattern.demo.adapter.example1.LogFileOperateApi;
import com.zmyuan.designPattern.demo.adapter.example1.LogModel;
import com.zmyuan.designPattern.demo.adapter.example2.LogDbOperateApi;

import java.util.List;

/**
 * Created by zdb on 2016/5/17.
 */
public class Adapter implements LogDbOperateApi {

    private LogFileOperateApi adaptee;

    public Adapter(LogFileOperateApi adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void createLog(LogModel logModel) {
        // 1. 先读取文件的内容
        List<LogModel> list = adaptee.readLogFile();
        // 2. 加入新的日志对象
        list.add(logModel);
        // 3. 重新写入文件
        adaptee.writeLogFile(list);
    }

    @Override
    public void updateLog(LogModel logModel) {
        // 1. 先读取文件的内容
        List<LogModel> list = adaptee.readLogFile();
        // 2. 修改相应的日志对象
        int idx = 0;
        for(LogModel lm : list) {
            if(lm.getLogId().equals(logModel.getLogId())) {
                list.set(idx, logModel);
            }
            idx ++;
        }
        // 3. 重新写入文件
        adaptee.writeLogFile(list);
    }

    @Override
    public void removeLog(LogModel logModel) {
        // 1. 先读取文件的内容
        List<LogModel> list = adaptee.readLogFile();
        // 2. 删除相应的日志对象
        list.remove(logModel);
        // 3. 重新写入文件
        adaptee.writeLogFile(list);
    }

    @Override
    public List<LogModel> getAllLog() {
        return adaptee.readLogFile();
    }
}
