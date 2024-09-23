package com.orjujeng.timesheet.Vo;

import java.io.Serializable;

public class OtherInfo implements Serializable {

    private int uncomplate;

    private int loginMember;

    public int getUncomplate() {
        return uncomplate;
    }

    public void setUncomplate(int uncomplate) {
        this.uncomplate = uncomplate;
    }

    public int getLoginMember() {
        return loginMember;
    }

    public void setLoginMember(int loginMember) {
        this.loginMember = loginMember;
    }

    public int getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(int loginTimes) {
        this.loginTimes = loginTimes;
    }

    private int loginTimes;
}
