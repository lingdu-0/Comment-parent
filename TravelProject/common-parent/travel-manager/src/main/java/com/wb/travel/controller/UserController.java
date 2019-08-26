package com.wb.travel.controller;

import com.wb.travel.service.UserService;
import com.wb.travel.vo.LoginUserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("login")
    @ResponseBody
    public String login(@Valid LoginUserVo loginUserVo, BindingResult result){
        System.out.println(loginUserVo);
        if (result.hasErrors()){

        }
        return "index";
    }

    @RequestMapping("reg")
    public String reg(){
        return "index";
    }


    @RequestMapping("index")
    public String index(){
        return "index";
    }


}
