package com.orjujeng.timesheet.Vo;

import java.io.Serializable;

public class LoginVo implements Serializable {

    private String username;
    private String code;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
