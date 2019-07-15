package com.hengkun.controller;/**
 * @author yunik
 * @create 2019-07-15 11:58
 **/

import com.hengkun.model.entity.Dishes;
import com.hengkun.service.DishesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.context.annotation.ComponentScan;

import javax.annotation.Resource;

/**
 * 根据菜品ID查找
 * @author yunik
 * @create 2019-07-15 11:58
 **/
@Controller
@ComponentScan(basePackages = "com.hengkun.service.DishesService")
@Slf4j
public class DishesController {
    @Resource
    private DishesService dishesService;
    @GetMapping(value = "/dishes/{id}")
    @ResponseBody
    public Dishes queryDishes(@PathVariable("id") Integer id){
        Dishes dishes = dishesService.queryDishesById(id);
        log.info("*************8");
        return dishesService.queryDishesById(id);
    }








    public String deleteDishes(@PathVariable("id") Integer id){
        return "删除成功";
    }
}
