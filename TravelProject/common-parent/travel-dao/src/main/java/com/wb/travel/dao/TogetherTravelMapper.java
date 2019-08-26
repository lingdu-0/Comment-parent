package com.wb.travel.dao;

import com.wb.travel.entity.TogetherTravel;
import com.wb.travel.entity.TogetherTravelExample;
import com.wb.travel.entity.TogetherTravelWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TogetherTravelMapper {
    int countByExample(TogetherTravelExample example);

    int deleteByExample(TogetherTravelExample example);

    int deleteByPrimaryKey(Integer togetherTravelId);

    int insert(TogetherTravelWithBLOBs record);

    int insertSelective(TogetherTravelWithBLOBs record);

    List<TogetherTravelWithBLOBs> selectByExampleWithBLOBs(TogetherTravelExample example);

    List<TogetherTravel> selectByExample(TogetherTravelExample example);

    TogetherTravelWithBLOBs selectByPrimaryKey(Integer togetherTravelId);

    int updateByExampleSelective(@Param("record") TogetherTravelWithBLOBs record, @Param("example") TogetherTravelExample example);

    int updateByExampleWithBLOBs(@Param("record") TogetherTravelWithBLOBs record, @Param("example") TogetherTravelExample example);

    int updateByExample(@Param("record") TogetherTravel record, @Param("example") TogetherTravelExample example);

    int updateByPrimaryKeySelective(TogetherTravelWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TogetherTravelWithBLOBs record);

    int updateByPrimaryKey(TogetherTravel record);
}