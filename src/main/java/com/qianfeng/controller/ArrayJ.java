package com.qianfeng.controller;


import com.qianfeng.entry.LastOrder;
import com.qianfeng.mapper.VMapper;
import com.qianfeng.util.ResMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ArrayJ {

    @Autowired
    VMapper vamapper;
    @RequestMapping(value = "/le/{dt}",method = RequestMethod.GET)
    public ResMsg i(@PathVariable("dt") String dt){
        List<Integer> l= null;
        ResMsg msg=null;
        try {
            List<LastOrder> lis = vamapper.lis(dt);
            l = new ArrayList();
            for (LastOrder la:lis) {
                l.add(Integer.parseInt(la.getA()));
                l.add(Integer.parseInt(la.getB()));
                l.add(Integer.parseInt(la.getC()));
            }
            msg=ResMsg.success();
                    msg.setData(l);
        } catch (NumberFormatException e) {
            msg=ResMsg.fail();
            msg.setData("[]");
            e.printStackTrace();
        }

        return msg;
    }
}
