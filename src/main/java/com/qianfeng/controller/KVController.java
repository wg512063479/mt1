package com.qianfeng.controller;

import com.qianfeng.entry.KVEntry;
import com.qianfeng.mapper.KVMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KVController {
    @Autowired
    KVMapper kvMapper;
    @RequestMapping("/listkv")
    public List<KVEntry> listkv(){
        return kvMapper.listkv();
    }
}
