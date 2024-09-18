package com.orjujeng.timesheet.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/auth")
@RestController
public class authHandler {

    @GetMapping("/poc")
    public String getPocInfo() {

        return "poc of java 17 and springboot 3.3";
    }
}