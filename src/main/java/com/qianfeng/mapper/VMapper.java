package com.qianfeng.mapper;

import com.qianfeng.entry.LastOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface VMapper {

    @Select("select\n" +
            "round(sum(zl.order_money)) a,\n" +
            "sum(zl.order_type) b,\n" +
            "sum(zl.order_status) c\n" +
            "from qfbap_source.us_order zl\n" +
            "where date(zl.order_date)=#{dt};")
    public List<LastOrder> lis(String dt);
}
