package com.hengkun.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hengkun.model.entity.Room;

/**
 * @author yunik
 * @create 2019-07-15 14:25
 **/
public interface RoomMapper extends BaseMapper<Room> {
    /**
     * 查询包间
     */

    Room queryRoomInfoById(Integer id0);
}
