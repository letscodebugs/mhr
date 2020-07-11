package com.tyu.mapper;

import com.tyu.pojo.SysMsg;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SysMsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysMsg record);

    int insertSelective(SysMsg record);

    SysMsg selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysMsg record);

    int updateByPrimaryKey(SysMsg record);
}
