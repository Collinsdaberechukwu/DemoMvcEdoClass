package com.example.demomvcedoclass.controller;

import com.example.demomvcedoclass.dto.LoginDto;
import com.example.demomvcedoclass.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequiredArgsConstructor
@Controller
@Slf4j
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @GetMapping("profile")
    public ModelAndView getUserProfile(){
        log.info("Controller Class = User Id ");
        return new ModelAndView("WelcomePage").addObject("login", new LoginDto());
    }
}
//https://github.com/Collinsdaberechukwu/DemoMvcEdoClass.git