package com.example.demomvcedoclass.controller;

import com.example.demomvcedoclass.dto.LoginDto;
import com.example.demomvcedoclass.dto.SignUp;
import com.example.demomvcedoclass.model.Users;
import com.example.demomvcedoclass.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/v1/login")
public class LoginController {
    private final UserService userService;
    @GetMapping("/sign-up/user")
    public  ModelAndView signUp(){
        return new ModelAndView("loginPage").addObject("user", new SignUp());
    }
    @PostMapping("/signUp-users")
      public String createUser(@ModelAttribute SignUp signUp,BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "WelcomePage";
        }
        try{
            signUp.setRole("ROLE_USER");
            userService.createUser(signUp);
        }
       catch (Exception e) {
        throw new RuntimeException(e);
    }
        return "/WelcomePage";
    }

}
