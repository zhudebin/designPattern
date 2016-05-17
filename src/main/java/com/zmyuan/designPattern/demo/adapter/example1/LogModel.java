package com.zmyuan.designPattern.demo.adapter.example1;

import java.io.Serializable;

/**
 * Created by zdb on 2016/5/17.
 */
public class LogModel implements Serializable {

    /**
     * 日志编号
     */
    private String logId;

    /**
     * 操作人员
     */
    private String operateUser;

    /**
     * 操作时间，以yyyy-MM-dd HH:mm:ss 的格式记录
     */
    private String operateTime;

    /**
     * 日志内容
     */
    private String logContent;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    public String getOperateUser() {
        return operateUser;
    }

    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser;
    }

    public String getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(String operateTime) {
        this.operateTime = operateTime;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    @Override
    public String toString() {
        return "LogModel{" +
                "logId='" + logId + '\'' +
                ", operateUser='" + operateUser + '\'' +
                ", operateTime='" + operateTime + '\'' +
                ", logContent='" + logContent + '\'' +
                '}';
    }
}
