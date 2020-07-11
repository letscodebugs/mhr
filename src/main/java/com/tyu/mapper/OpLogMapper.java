package com.tyu.mapper;

import com.tyu.pojo.OpLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OpLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OpLog record);

    int insertSelective(OpLog record);

    OpLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OpLog record);

    int updateByPrimaryKey(OpLog record);
}
