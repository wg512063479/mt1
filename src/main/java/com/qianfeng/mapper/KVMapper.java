package com.qianfeng.mapper;

import com.qianfeng.entry.KVEntry;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface KVMapper {
    @Select("select\n"+
            "od.order_no k,\n"+
            "od.order_id v\n"+
            "from us_order od;")
    public List<KVEntry> listkv();
}
