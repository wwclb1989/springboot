package com.itheima.itcastchapter04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Calendar;

@Controller
public class LoginController {

    /**
     * 获取并封装当前年份，跳转到登录页login.html
     */
    @GetMapping("/toLoginPage")
    public String toLoginPage(Model model) {
        model.addAttribute("currentYear", Calendar.getInstance().get(Calendar.YEAR));
        return "login";
    }

}
