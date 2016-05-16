package com.zmyuan.designPattern.demo.facade.example2;

import com.zmyuan.designPattern.demo.facade.example1.Business;
import com.zmyuan.designPattern.demo.facade.example1.DAO;
import com.zmyuan.designPattern.demo.facade.example1.Presentation;

/**
 * Created by zdb on 2016/5/17.
 */
public class Facade {

    public void generate() {
        new Presentation().generate();
        new Business().generate();
        new DAO().generate();
    }

}
