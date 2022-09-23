package com.local.use.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/main")
public class MainController {
    @GetMapping("/profile")
    public ModelAndView profile() {
        return new ModelAndView("profile.html");
    }
}
