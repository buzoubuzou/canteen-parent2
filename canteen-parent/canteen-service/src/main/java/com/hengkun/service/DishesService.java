package com.hengkun.service;

import com.hengkun.model.entity.Dishes;

import java.util.List;


/**
 *Service
 * @author yunik
 * @create 2019-07-15 14:19
 **/
public interface DishesService {


    Dishes queryDishesById(Integer id);


    Boolean insertDishesInfo(Dishes dishes);

    Boolean updateDishesInfo(Dishes dishes);

    Boolean deleteDishesInfo(Integer id);


    List<Dishes> queryDishes(Dishes dishes, int pageNo, int pageSize);

    List<Dishes> queryAllDishes();

    String list();

    Dishes queryDishes(Integer id);

    Integer insertDishes(Dishes dishes);

    Integer deleteDishes(Integer id);
}
