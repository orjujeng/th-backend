package com.orjujeng.timesheet.Service.Impl;

import com.orjujeng.timesheet.DAO.DashboradDAO;
import com.orjujeng.timesheet.DO.DashboradInfoDO;
import com.orjujeng.timesheet.Service.DashboardInfo;
import com.orjujeng.timesheet.Vi.DashboradParam;
import com.orjujeng.timesheet.Vo.DashboardVo;
import com.orjujeng.timesheet.Vo.OtherInfo;
import com.orjujeng.timesheet.Vo.Overview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class DashboardInfoImpl implements DashboardInfo {
    @Autowired
    DashboradDAO dashboradDAO;
    @Override
    @Cacheable(value = "dashborad",key = "#input.period")
    public DashboardVo getDashboardInfo(DashboradParam input) {
        DashboardVo result =new DashboardVo();
        Overview overview = new Overview();
        OtherInfo otherInfo = new OtherInfo();
        String dbInput = input.getPeriod() + "/01";
        List<DashboradInfoDO> dbResults =dashboradDAO.seletctDashboradInfoWithPeriod(dbInput);
        int [] followNumber = new int[12];
        int [][] memberNumber = new int[dbResults.size()][5];
        for (int i = 0; i < dbResults.size(); i++) {
           overview.setNewMember(overview.getNewMember()+dbResults.get(i).getNewMember());
           overview.setSupportMember(overview.getSupportMember()+dbResults.get(i).getSupportMember());
           overview.setSupportProjects(dbResults.get(i).getSupportProjects());
           overview.setTimesheetCollection(overview.getTimesheetCollection()+dbResults.get(i).getTimesheetCollection());
           otherInfo.setLoginMember(otherInfo.getLoginMember()+dbResults.get(i).getLoginMember());
           otherInfo.setLoginTimes(otherInfo.getLoginTimes()+dbResults.get(i).getLoginTimes());
           otherInfo.setUncomplate(otherInfo.getUncomplate()+dbResults.get(i).getUncomplate());
           SimpleDateFormat formatter = new SimpleDateFormat("yyyyMM");
           int m =  Integer.parseInt(formatter.format(dbResults.get(i).getMonth()));
           memberNumber[i][0]=m;
           memberNumber[i][1]=dbResults.get(i).getT1Member();
           memberNumber[i][2]=dbResults.get(i).getT2Member();
           memberNumber[i][3]=dbResults.get(i).getT3Member();
           memberNumber[i][4]=dbResults.get(i).getT4Member();
        }
        Date now = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(now);
        calendar.add(Calendar.YEAR, -1);
        calendar.add(Calendar.MONTH, +1);
        Date nowMinusOneYear = calendar.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM");
        List<DashboradInfoDO> db12Results =dashboradDAO.seletctDashboradInfoWithPeriod( formatter.format(nowMinusOneYear)+"/01");
        for (int i = 0; i < db12Results.size(); i++) {
            followNumber[db12Results.size()-i-1]=db12Results.get(i).getSupportMember();
        }
        result.setOverview(overview);
        result.setFollowNumber(followNumber);
        result.setMemberNumber(memberNumber);
        result.setOtherinfo(otherInfo);
        result.setCode("200");
        return result;
    }

    @Override
    @CacheEvict(value = "dashborad",allEntries = true)
    public void clearDashboradInfoCahe() {

    }
}
