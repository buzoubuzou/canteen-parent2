package com.hengkun.service.Impl;/**
 * @author yunik
 * @create 2019-07-15 14:20
 **/
import com.hengkun.dao.RoomMapper;
import com.hengkun.model.entity.Room;
import com.hengkun.service.RoomService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 包间接口
 * @author yunik
 * @create 2019-07-15 14:20
 **/

@Service
@ComponentScan(basePackages = "com.hengkun.dao.RoomMapper")
public class RoomServiceImpl implements RoomService {
    @Resource
    private RoomMapper roomMapper;


    @Override
    public Room queryRoomById(Integer id) {
        Room room = roomMapper.selectById(id);
        System.out.println(room);
        return roomMapper.selectById(id);
    }
}
