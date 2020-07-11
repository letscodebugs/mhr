package com.tyu.mapper;

import com.tyu.pojo.Employeeec;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeecMaper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employeeec record);

    int insertSelective(Employeeec record);

    Employeeec selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employeeec record);

    int updateByPrimaryKey(Employeeec record);
}
