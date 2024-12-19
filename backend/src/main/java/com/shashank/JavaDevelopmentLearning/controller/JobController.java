package com.shashank.JavaDevelopmentLearning.controller;


import com.shashank.JavaDevelopmentLearning.model.JobPost;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {

    @GetMapping({"/","/home"})
    public String home(){
        return "home";
    }

    @GetMapping("/addjob")
    public String addJob(){
        return "addJob";
    }

    @PostMapping("/handleForm")
    public String handleForm(JobPost jobPost){
        return "success";
    }



}
