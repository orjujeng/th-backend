package com.orjujeng.timesheet.DAO;

import com.orjujeng.timesheet.DO.AuthMemberDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AuthDAO {
    AuthMemberDO selectAuthMemberByEmailAndPw(@Param("email") String email,@Param("password") String password);
    int updateAuthMemberByEmail(@Param("email") String email);

    int insertAuthMemberInfo(@Param("email") String email);
}
