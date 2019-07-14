package com.hengkun.dao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hengkun.model.entity.Goods;


public interface GoodsMapper extends BaseMapper<Goods>{
    Goods queryGoodsInfoById(Integer id);
}
