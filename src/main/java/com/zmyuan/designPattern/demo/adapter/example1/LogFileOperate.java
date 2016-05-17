package com.zmyuan.designPattern.demo.adapter.example1;

import java.io.*;
import java.util.List;

/**
 * Created by zdb on 2016/5/17.
 */
public class LogFileOperate implements LogFileOperateApi {

    /**
     * 日志文件的路径和文件名称，默认是当前项目根下的AdapterLog.log
     */
    private String logFilePathName = "AdapterLog.log";

    /**
     * 构造方法，传入文件的路径和名称
     * @param logFilePathName 文件的路径和名称
     */
    public LogFileOperate(String logFilePathName) {
        // 先判断是是否传入了文件的路径和名称，如果是，
        // 就重新设置操作的日志文件的路径和名称
        if(logFilePathName != null && logFilePathName.trim().length()>0) {
            this.logFilePathName = logFilePathName;
        }
    }

    @Override
    public List<LogModel> readLogFile() {
        List<LogModel> list = null;
        ObjectInputStream oin = null;
        File file = new File(logFilePathName);
        if(file.exists()) {
            try {
                oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
                list = (List<LogModel>)oin.readObject();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                if(oin != null) {
                    try {
                        oin.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return list;
    }

    @Override
    public void writeLogFile(List<LogModel> list) {
        File file = new File(logFilePathName);
        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            oos.writeObject(list);
            oos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
