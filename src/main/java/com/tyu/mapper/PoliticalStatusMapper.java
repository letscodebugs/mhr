package com.tyu.mapper;

import com.tyu.pojo.PoliticalStatus;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PoliticalStatusMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PoliticalStatus record);

    int insertSelective(PoliticalStatus record);

    PoliticalStatus selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PoliticalStatus record);

    int updateByPrimaryKey(PoliticalStatus record);

    List<PoliticalStatus> getAllPoliticsstatus();
}
