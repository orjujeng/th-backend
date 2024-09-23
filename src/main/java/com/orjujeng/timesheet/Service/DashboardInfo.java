package com.orjujeng.timesheet.Service;

import com.orjujeng.timesheet.Vi.DashboradParam;
import com.orjujeng.timesheet.Vo.DashboardVo;


public interface DashboardInfo {
    DashboardVo getDashboardInfo(DashboradParam input);
    void clearDashboradInfoCahe();
}
