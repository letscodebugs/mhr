package com.tyu.mapper;

import com.tyu.pojo.MsgContent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MsgContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MsgContent record);

    int insertSelective(MsgContent record);

    MsgContent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MsgContent record);

    int updateByPrimaryKey(MsgContent record);
}
