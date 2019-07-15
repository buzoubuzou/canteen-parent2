package com.hengkun.service.Impl;

import com.hengkun.dao.DishesMapper;
import com.hengkun.model.entity.Dishes;
import com.hengkun.service.DishesService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 菜品接口
 * @author yunik
 * @create 2019-07-15 14:20
 **/

@Service
@ComponentScan(basePackages = "com.hengkun.dao.DishesMapper")
public class DishesServiceImpl implements DishesService{
    @Resource
    private DishesMapper dishesMapper;

    @Override
    public Dishes queryDishesById(Integer id){
        Dishes dishes = dishesMapper.selectById(id);
        System.out.println(dishes);
        return dishesMapper.selectById(id);
    }

 @Override
   public int insertDishesInfo(Dishes dishes) {
        return dishesMapper.insert(dishes); }
   @Override
  public int  updateDishesInfo(Dishes dishes) { return dishesMapper.updateById(dishes); }


    @Override
   public int deleteDishesById(Integer id) {
       int dishes = dishesMapper.deleteById(id);
       System.out.println("删除成功");
       System.out.println(dishes);
        return dishesMapper.deleteById(id); }


}
