package com.orjujeng.timesheet.Service.Impl;

import com.orjujeng.timesheet.DAO.LoginDAO;
import com.orjujeng.timesheet.DO.AuthMemberDO;
import com.orjujeng.timesheet.Service.AuthInfo;
import com.orjujeng.timesheet.Vi.LoginParam;
import com.orjujeng.timesheet.Vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthInfoImpl implements AuthInfo {
    @Autowired
    LoginDAO loginDAO;
    @Override
    public LoginVo getAuthInfo(LoginParam input) {
        AuthMemberDO result = loginDAO.selectAuthMemberByEmailAndPw(input.getEmail(),input.getPassword());
        LoginVo output = new LoginVo();
        if(result!=null&&result.getEmail()!= null&&result.getEmail()!=""){
            output.setCode("200");
            output.setUsername(result.getEmail());
        }else {
            output.setCode("404");
        }
        return output;
    }
}
