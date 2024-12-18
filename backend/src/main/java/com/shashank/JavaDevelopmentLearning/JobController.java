package com.shashank.JavaDevelopmentLearning;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {

    @GetMapping({"/","/home"})
    public String home(){
        return "home";
    }
}
