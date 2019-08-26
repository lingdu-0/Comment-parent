package com.wb.travel;

import com.wb.travel.entity.Strategy;
import com.wb.travel.entity.StrategyExample;
import org.junit.Test;

import java.util.List;

public class StrategyTest extends BaseTest {
    @Test
    public void selectAll() {
//        List<Strategy> list = strategyMapper.selectByExample(new StrategyExample());
//        for (Strategy s : list)
//            System.out.println(s);
        System.out.println(strategyMapper.selectByPrimaryKey(1));
    }
}
