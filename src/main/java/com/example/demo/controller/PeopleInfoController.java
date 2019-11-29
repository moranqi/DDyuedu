package com.example.demo.controller;

import com.example.demo.Service.PeopleService;
import com.example.demo.dataobject.PeopleInfo;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/login")
@Slf4j
public class PeopleInfoController {
    @Autowired
    private PeopleService peopleService;
    @GetMapping("/index")
    @ApiOperation(value = "登录界面",notes = "登录界面")
    public ModelAndView index(){
        return new ModelAndView("login/index");
    }

    @GetMapping("/login")
    @ApiOperation(value = "登录操作",notes = "登录操作")
    public ModelAndView login(@RequestParam(value = "username",required = false) String username,
                              @RequestParam(value = "password",required = false) String password){
        ModelAndView modelAndView=new ModelAndView("/login/index");
        PeopleInfo peopleInfo;
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)){
            modelAndView.addObject("message","登录用户名或密码不能为空！");
            return modelAndView;
        }else {
            peopleInfo=peopleService.findByUsernameAndAndPassword(username,password);
            if (peopleInfo==null){
                modelAndView.addObject("message","登录用户名或密码错误！");
                return modelAndView;
            }else {
                modelAndView = new ModelAndView("/index");
                modelAndView.addObject("message","登录成功!");
                return modelAndView;
            }
        }

    }
}
