package com.orjujeng.timesheet.Service.Impl;

import com.orjujeng.timesheet.DAO.DashboradDAO;
import com.orjujeng.timesheet.Service.DashboardInfo;
import com.orjujeng.timesheet.Vi.DashboradParam;
import com.orjujeng.timesheet.Vo.DashboardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardInfoImpl implements DashboardInfo {
    @Autowired
    DashboradDAO dashboradDAO;
    @Override
    public DashboardVo getDashboardInfo(DashboradParam input) {
        dashboradDAO.seletctDashboradInfoWithPeriod(input.getPeriod());
        return null;
    }
}
