package com.patika.kredinbizdenservice.user.controller;

import com.patika.kredinbizdenservice.application.entity.Application;
import com.patika.kredinbizdenservice.user.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/get-all-applications/{email}")
    public void getAllApplicationsViaEmail(@PathVariable(value = "email") String email){
        List<Application> applications = userService.listApplicationsByEmail(email);
    }
}
