package com.orjujeng.timesheet.DAO;

import com.orjujeng.timesheet.DO.DashboradInfoDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DashboradDAO {
    List<DashboradInfoDO> seletctDashboradInfoWithPeriod(@Param("month") String month);
}
