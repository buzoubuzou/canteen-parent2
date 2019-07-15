package com.hengkun.controller;

import com.hengkun.model.entity.Goods;
import com.hengkun.service.GoodsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
@RestController
@ComponentScan(basePackages = "com.hengkun.service.GoodsService")
@Slf4j
public class GoodsController {

    @Resource
    private GoodsService goodsService;

    @GetMapping(value = "/goods/{id}")
    @ResponseBody
    public Goods queryGoods(@PathVariable("id") Integer id){
        Goods goods=goodsService.queryGoodsById(id);
        log.info("************************");
        return goodsService.queryGoodsById(id);
    }

}
