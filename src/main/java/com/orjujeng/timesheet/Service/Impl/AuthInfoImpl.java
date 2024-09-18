package com.orjujeng.timesheet.Service.Impl;

import com.orjujeng.timesheet.Service.AuthInfo;
import com.orjujeng.timesheet.Vi.LoginParam;
import com.orjujeng.timesheet.Vo.LoginVo;
import org.springframework.stereotype.Service;

@Service
public class AuthInfoImpl implements AuthInfo {
    @Override
    public LoginVo getAuthInfo(LoginParam input) {
        LoginVo output = new LoginVo();
        output.setCode("200");
        output.setUsername("orjujeng@hotamil.com");
        return output;
    }
}
