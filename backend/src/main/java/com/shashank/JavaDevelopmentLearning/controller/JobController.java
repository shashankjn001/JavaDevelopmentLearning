package com.shashank.JavaDevelopmentLearning.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {

    @GetMapping({"/","/home"})
    public String home(){
        return "home";
    }

    @PostMapping("/addjob")
    public String addJob(){
        return "addJob";
    }
    @GetMapping("/handleForm")
    public String handleForm(){
        return "success";
    }

}
