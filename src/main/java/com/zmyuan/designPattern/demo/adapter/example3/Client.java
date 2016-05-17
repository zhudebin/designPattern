package com.zmyuan.designPattern.demo.adapter.example3;

/**
 * Created by zdb on 2016/5/17.
 */
public class Client {

    public static void main(String[] args) {
        // 创建需要被适配的对象
        Adaptee adaptee = new Adaptee();

        // 创建客户端需要调用的接口对象
        Target target = new Adapter(adaptee);

        // 请求处理
        target.request();
    }

}
