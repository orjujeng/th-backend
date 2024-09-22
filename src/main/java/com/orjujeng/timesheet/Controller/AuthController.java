package com.orjujeng.timesheet.Controller;

import com.orjujeng.timesheet.Service.AuthInfo;
import com.orjujeng.timesheet.Utils.Response;
import com.orjujeng.timesheet.Vi.LoginParam;

import com.orjujeng.timesheet.Vi.RegParam;
import com.orjujeng.timesheet.Vi.ResetParam;
import com.orjujeng.timesheet.Vo.LoginVo;
import com.orjujeng.timesheet.Vo.RegVo;
import com.orjujeng.timesheet.Vo.ResetVo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/auth")
@Controller
@ResponseBody
@CrossOrigin(origins = "*")
public class AuthController {
    @Autowired
    AuthInfo authinfo;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Response memberLogin(@RequestBody @Valid LoginParam input) {
        LoginVo output = authinfo.getAuthInfo(input);
        return Response.success(output);
    }
    @RequestMapping(value = "/reset",method = RequestMethod.POST)
    public Response memberResetPw(@RequestBody @Valid ResetParam input) {
        ResetVo output = authinfo.updateAuthInfo(input);
        return Response.success(output);
    }

    @RequestMapping(value = "/reg",method = RequestMethod.POST)
    public Response memberResetPw(@RequestBody @Valid RegParam input) {
        RegVo output = authinfo.insertAuthInfo(input);
        return Response.success(output);
    }
}