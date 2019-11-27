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


import javax.servlet.http.HttpServletResponse;
import java.util.Map;

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
                              @RequestParam(value = "password",required = false) String password,
                              HttpServletResponse response,
                              Map<String,Object> map){
        PeopleInfo peopleInfo;
        if (StringUtils.isEmpty(username)){
            peopleInfo=peopleService.findByUsernameAndAndPassword(username, password);
        }
        map.put("")
        return
    }
}
