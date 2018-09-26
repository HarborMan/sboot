package com.action.sboot.controller;

import com.sun.deploy.net.HttpResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api")
public class UserController {

    @RequestMapping("login/login")
    public Map<String, Object> getUser(Map<String,Object> params){

        Map<String,Object> map = new HashMap<>();
        map.put("roles","admin");
        map.put("token","admin");
        map.put("introduction","我是超级管理员");
        map.put("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        map.put("name","Super Admin");
        return map;
    }

    @RequestMapping("user/info")
    public Map<String, Object> aaa(Map<String,Object> params){
        Map<String,Object> map = new HashMap<>();
        map.put("roles","admin");
        map.put("token","admin");
        map.put("introduction","我是超级管理员");
        map.put("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        map.put("name","Super Admin");
        return map;
    }
}
