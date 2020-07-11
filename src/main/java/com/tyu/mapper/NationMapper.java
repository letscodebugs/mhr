package com.tyu.mapper;

import com.tyu.pojo.Nation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Nation record);

    int insertSelective(Nation record);

    Nation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Nation record);

    int updateByPrimaryKey(Nation record);

    List<Nation> getAllNations();
}
