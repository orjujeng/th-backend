package com.orjujeng.timesheet.DAO;

import com.orjujeng.timesheet.DO.DashboradInfoDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DashboradDAO {
    DashboradInfoDO seletctDashboradInfoWithPeriod(@Param("month") String month);
}
