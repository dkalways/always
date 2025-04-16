package com.dkalways.always;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/test")
    public String test(){
        System.out.println("HI");
        return "Hello World";
    }
}
