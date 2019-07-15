package com.hengkun.controller;/**
 * @author yunik
 * @create 2019-07-15 14:28
 **/

import com.hengkun.model.entity.Room;
import com.hengkun.service.RoomService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 根据包间ID查找
 * @author yunik
 * @create 2019-07-15 14:28
 **/
@RestController
@ComponentScan(basePackages = "com.hengkun.service.RoomService")
@Slf4j
public class RoomController {
    @Resource
    private RoomService roomService;
    @GetMapping(value = "/room/{id}")
    @ResponseBody
    public Room queryRoom(@PathVariable("id") Integer id){
        Room room = roomService.queryRoomById(id);
        log.info("*************8");
        return roomService.queryRoomById(id);
    }
}
