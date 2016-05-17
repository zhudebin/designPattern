package com.zmyuan.designPattern.demo.adapter.example2;

import com.zmyuan.designPattern.demo.adapter.example1.LogModel;

import java.util.List;

/**
 * Created by zdb on 2016/5/17.
 */
public interface LogDbOperateApi {

    void createLog(LogModel logModel);
    void updateLog(LogModel logModel);
    void removeLog(LogModel logModel);
    List<LogModel> getAllLog();
}
