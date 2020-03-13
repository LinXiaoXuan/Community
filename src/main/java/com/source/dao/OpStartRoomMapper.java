package com.source.dao;

import com.source.model.OpStartRoom;
import com.source.model.OpStartRoomExample;
import java.util.List;

public interface OpStartRoomMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OpStartRoom record);

    int insertSelective(OpStartRoom record);

    List<OpStartRoom> selectByExample(OpStartRoomExample example);

    OpStartRoom selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OpStartRoom record);

    int updateByPrimaryKey(OpStartRoom record);
}