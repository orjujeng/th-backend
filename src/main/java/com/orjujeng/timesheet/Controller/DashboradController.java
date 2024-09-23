package com.orjujeng.timesheet.Controller;

import com.orjujeng.timesheet.Service.DashboardInfo;
import com.orjujeng.timesheet.Utils.Response;
import com.orjujeng.timesheet.Vi.DashboradParam;
import com.orjujeng.timesheet.Vo.DashboardVo;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/dashborad")
@Controller
@ResponseBody
@CrossOrigin(origins = "*")
public class DashboradController {
    @Autowired
    DashboardInfo dashboardInfo;
    @RequestMapping(value = "/dashborad",method = RequestMethod.POST)
    public Response Dashborad(@RequestBody @Valid DashboradParam input) {
        DashboardVo output = dashboardInfo.getDashboardInfo(input);
        return Response.success(output);
    }

    @RequestMapping(value = "/clearCache",method = RequestMethod.GET)
    public Response ClearCache() {
        dashboardInfo.clearDashboradInfoCahe();
        return Response.success("success");
    }
}
