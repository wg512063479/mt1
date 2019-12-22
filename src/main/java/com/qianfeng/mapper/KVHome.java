package com.qianfeng.mapper;

import com.qianfeng.entry.KVEntry;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface KVHome {
    @Select("select\n"+
            "od.province k,\n"+
            "od.city v\n"+
            "from order_distribute od;")
    public List<KVEntry> li();
}
