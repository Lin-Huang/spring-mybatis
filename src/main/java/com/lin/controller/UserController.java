package com.lin.controller;

import com.lin.domain.User;
import com.lin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/getUser")
    @ResponseBody
    public Object getUser(@RequestParam("id") Integer id){
        User user = userService.selectByKey(id);
        return user;
    }
}
