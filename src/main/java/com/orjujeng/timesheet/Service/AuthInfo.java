package com.orjujeng.timesheet.Service;

import com.orjujeng.timesheet.Vi.LoginParam;
import com.orjujeng.timesheet.Vo.LoginVo;



public interface AuthInfo {
    LoginVo getAuthInfo(LoginParam input);
}
