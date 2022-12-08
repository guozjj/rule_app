package com.fnd.controller;

import com.fnd.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @PostMapping("/getUser")
    public String getUser(@RequestParam("id") Long id){
        return testService.getTest(id).toString();
    }

    @GetMapping("/test")
    public String test(){
        return testService.getTest(1L).toString();
    }
}
