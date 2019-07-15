package com.hengkun.service.Impl;


import com.hengkun.dao.GoodsMapper;
import com.hengkun.model.entity.Goods;
import com.hengkun.service.GoodsService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
@ComponentScan(basePackages = "com.hengkun.dao.GoodsMapper")

public class GoodsServiceImpl implements GoodsService {

    @Resource
    private  GoodsMapper goodsMapper;
    @Override
    public Goods queryGoodsById(Integer id) {
        Goods goods =goodsMapper.selectById(id);
        System.out.println(goods);
        return goodsMapper.selectById(id);
    }
    @Override
    public int insertGoodsInfo(Goods goods) {
        return goodsMapper.insert(goods);
    }

    @Override
    public int updateGoodsInfo(Goods goods) {
        return goodsMapper.updateById(goods);
    }

    @Override
    public int deleteGoodsInfo(Integer id) {
        return goodsMapper.deleteById(id);
    }
}
