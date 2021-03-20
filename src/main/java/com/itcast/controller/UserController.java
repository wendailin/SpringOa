package com.itcast.controller;

import com.itcast.domain.User;
import com.itcast.mapper.UserMapper;
import com.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/findAll")
    public List<User>findUserAll(){
       return userService.findAll();
    }
    @RequestMapping("/findById")
    public User findbyID(Integer id){
        return userService.findbyID(id);
    }
    @RequestMapping("/updateUser")
    public void updateUser(User user){
         userService.updateUser(user);
    }
}
