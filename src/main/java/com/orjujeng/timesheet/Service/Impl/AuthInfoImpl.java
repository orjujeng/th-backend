package com.orjujeng.timesheet.Service.Impl;

import com.orjujeng.timesheet.DAO.AuthDAO;
import com.orjujeng.timesheet.DO.AuthMemberDO;
import com.orjujeng.timesheet.Service.AuthInfo;
import com.orjujeng.timesheet.Vi.LoginParam;
import com.orjujeng.timesheet.Vi.RegParam;
import com.orjujeng.timesheet.Vi.ResetParam;
import com.orjujeng.timesheet.Vo.LoginVo;
import com.orjujeng.timesheet.Vo.RegVo;
import com.orjujeng.timesheet.Vo.ResetVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthInfoImpl implements AuthInfo {
    @Autowired
    AuthDAO authDAO;
    @Override
    public LoginVo getAuthInfo(LoginParam input) {
        LoginVo output = new LoginVo();
        AuthMemberDO result = authDAO.selectAuthMemberByEmailAndPw(input.getEmail(),input.getPassword());
        if(result!=null&&result.getEmail()!= null&&result.getEmail()!=""){
            output.setCode("200");
            output.setUsername(result.getEmail());
        }else {
            output.setCode("404");
        }
        return output;
    }

    @Override
    public ResetVo updateAuthInfo(ResetParam input) {
        ResetVo output = new ResetVo();
        int updateResult =authDAO.updateAuthMemberByEmail(input.getEmail());
        if(updateResult==1){
            output.setCode("200");
        }else {
            output.setCode("404");
        }
        return output;
    }

    @Override
    public RegVo insertAuthInfo(RegParam input) {
        RegVo output = new RegVo();
        AuthMemberDO result = authDAO.selectAuthMemberByEmailAndPw(input.getEmail(),null);
        if(result==null){
            int insertResult = authDAO.insertAuthMemberInfo(input.getEmail());
            if(insertResult==1){
                output.setCode("200");
            }else {
                output.setCode("404");
            }
        }else{
            output.setCode("404");
        }
        return output;
    }
}
