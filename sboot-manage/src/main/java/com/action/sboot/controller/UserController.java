package com.action.sboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api")
public class UserController {

    @RequestMapping("user")
    public Object user(){
        System.out.println("==========================================");
        return null;
    }
}
