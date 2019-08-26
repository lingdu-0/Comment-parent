package com.wb.travel.dao;

import com.wb.travel.entity.Strategy;
import com.wb.travel.entity.StrategyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StrategyMapper {
    int countByExample(StrategyExample example);

    int deleteByExample(StrategyExample example);

    int deleteByPrimaryKey(Integer strategyId);

    int insert(Strategy record);

    int insertSelective(Strategy record);

    List<Strategy> selectByExampleWithBLOBs(StrategyExample example);

    List<Strategy> selectByExample(StrategyExample example);

    Strategy selectByPrimaryKey(Integer strategyId);

    int updateByExampleSelective(@Param("record") Strategy record, @Param("example") StrategyExample example);

    int updateByExampleWithBLOBs(@Param("record") Strategy record, @Param("example") StrategyExample example);

    int updateByExample(@Param("record") Strategy record, @Param("example") StrategyExample example);

    int updateByPrimaryKeySelective(Strategy record);

    int updateByPrimaryKeyWithBLOBs(Strategy record);

    int updateByPrimaryKey(Strategy record);
}