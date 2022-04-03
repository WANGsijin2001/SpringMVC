package com.atguigu.mvc.dao.mapper;

import com.atguigu.mvc.dao.pojo.Goods;

import java.util.List;

public interface GoodsMapper {

    List<Goods> get_goods_list();
    Goods Insert_Goods(Goods goods);
}
