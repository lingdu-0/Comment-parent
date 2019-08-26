package com.wb.travel.dao;

import com.wb.travel.entity.ScenicSpot;
import com.wb.travel.entity.ScenicSpotExample;
import com.wb.travel.entity.ScenicSpotWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScenicSpotMapper {
    int countByExample(ScenicSpotExample example);

    int deleteByExample(ScenicSpotExample example);

    int deleteByPrimaryKey(Integer scenicSpotId);

    int insert(ScenicSpotWithBLOBs record);

    int insertSelective(ScenicSpotWithBLOBs record);

    List<ScenicSpotWithBLOBs> selectByExampleWithBLOBs(ScenicSpotExample example);

    List<ScenicSpot> selectByExample(ScenicSpotExample example);

    ScenicSpotWithBLOBs selectByPrimaryKey(Integer scenicSpotId);

    int updateByExampleSelective(@Param("record") ScenicSpotWithBLOBs record, @Param("example") ScenicSpotExample example);

    int updateByExampleWithBLOBs(@Param("record") ScenicSpotWithBLOBs record, @Param("example") ScenicSpotExample example);

    int updateByExample(@Param("record") ScenicSpot record, @Param("example") ScenicSpotExample example);

    int updateByPrimaryKeySelective(ScenicSpotWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ScenicSpotWithBLOBs record);

    int updateByPrimaryKey(ScenicSpot record);
}