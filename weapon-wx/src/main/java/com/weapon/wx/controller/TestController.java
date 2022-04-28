package com.weapon.wx.controller;

import com.weapon.wx.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("main")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("oauth2")
    public String oauth2(HttpServletRequest request, HttpServletResponse response, String code, String enc) {
        testService.test(1);
        return "nacos service success";
    }

}
