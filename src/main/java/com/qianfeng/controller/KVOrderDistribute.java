package com.qianfeng.controller;

import com.qianfeng.entry.KVEntry;
import com.qianfeng.mapper.KVHome;
import com.qianfeng.mapper.KVMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;
import java.util.List;

@RestController
public class KVOrderDistribute {
    @Autowired
    KVHome kvHome;
    @RequestMapping("/li")
    public List<KVEntry> li(){
        return kvHome.li();
    }
}
