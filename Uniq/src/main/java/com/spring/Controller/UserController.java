package com.spring.Controller;

import com.spring.Entity.User;
import com.spring.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/home")
    public String login(){
        return "home";
}
@RequestMapping("/save")
    public String saveuser(User user){
        userService.saveoneuser(user);
        return "home";
    }
}
