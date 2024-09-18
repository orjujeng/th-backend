package com.orjujeng.timesheet.Controller;

import com.orjujeng.timesheet.Service.AuthInfo;
import com.orjujeng.timesheet.Service.Impl.AuthInfoImpl;
import com.orjujeng.timesheet.Utils.Response;
import com.orjujeng.timesheet.Vi.LoginParam;

import com.orjujeng.timesheet.Vo.LoginVo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/auth")
@Controller
@ResponseBody
public class AuthController {
    @Autowired
    AuthInfo authinfo;
    @RequestMapping(value = "/login",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Response memberLogin(@RequestBody @Valid LoginParam input) {
        LoginVo output = authinfo.getAuthInfo(input);
        return Response.success(output);
    }
}