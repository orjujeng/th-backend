package com.orjujeng.timesheet.Service;

import com.orjujeng.timesheet.Vi.LoginParam;
import com.orjujeng.timesheet.Vi.RegParam;
import com.orjujeng.timesheet.Vi.ResetParam;
import com.orjujeng.timesheet.Vo.LoginVo;
import com.orjujeng.timesheet.Vo.RegVo;
import com.orjujeng.timesheet.Vo.ResetVo;


public interface AuthInfo {
    LoginVo getAuthInfo(LoginParam input);
    ResetVo updateAuthInfo(ResetParam input);
    RegVo insertAuthInfo(RegParam input);
}
