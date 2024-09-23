package com.orjujeng.timesheet.Vo;

import java.io.Serializable;

public class DashboardVo implements Serializable {
    private String code;

    private Overview overview;

    private OtherInfo otherinfo;

    public Overview getOverview() {
        return overview;
    }

    public void setOverview(Overview overview) {
        this.overview = overview;
    }

    public OtherInfo getOtherinfo() {
        return otherinfo;
    }

    public void setOtherinfo(OtherInfo otherinfo) {
        this.otherinfo = otherinfo;
    }

    public int[] getFollowNumber() {
        return followNumber;
    }

    public void setFollowNumber(int[] followNumber) {
        this.followNumber = followNumber;
    }

    public int[][] getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(int[][] memberNumber) {
        this.memberNumber = memberNumber;
    }

    private  int[] followNumber;

    private  int[][] memberNumber;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
