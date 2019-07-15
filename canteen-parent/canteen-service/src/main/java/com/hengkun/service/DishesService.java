package com.hengkun.service;

import com.hengkun.model.entity.Dishes;

/**
 *Service
 * @author yunik
 * @create 2019-07-15 14:19
 **/
public interface DishesService {

    Dishes queryDishesById(Integer id);

    int insertDishesInfo(Dishes dishes);

    int updateDishesInfo(Dishes dishes);

    int deleteDishesById(Integer id);
}
