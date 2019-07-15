package com.hengkun.dao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hengkun.model.entity.Goods;
import org.apache.ibatis.annotations.Mapper;


public interface  GoodsMapper extends BaseMapper<Goods>{
    Goods queryGoodsInfoById(Integer id);

}
