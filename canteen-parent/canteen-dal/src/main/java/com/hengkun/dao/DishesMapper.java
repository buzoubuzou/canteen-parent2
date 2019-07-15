package com.hengkun.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hengkun.model.entity.Dishes;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishesMapper extends BaseMapper<Dishes> {
/**
 * 查询菜品
 */
    Dishes queryDishesInfoById(Integer id);



}
