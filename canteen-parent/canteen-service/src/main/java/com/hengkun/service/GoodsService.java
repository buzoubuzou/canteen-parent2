package com.hengkun.service;

import com.hengkun.model.entity.Goods;

public interface GoodsService {
    Goods queryGoodsById(Integer id);

    int insertGoodsInfo(Goods goods);

    int updateGoodsInfo(Goods goods);

    int deleteGoodsInfo(Integer id);
}
