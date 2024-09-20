package com.orjujeng.timesheet.DAO;

import com.orjujeng.timesheet.DO.AuthMemberDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface LoginDAO {
    AuthMemberDO selectAuthMemberByEmailAndPw(@Param("email") String email,@Param("password") String password);
}
