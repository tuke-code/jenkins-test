package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 @desc ...
 @date 2021-02-04 21:24:10
 @author jamison
 */
@RestController
@RequestMapping("hello")
public class HelloWebfluxController {

    @GetMapping("webflux")
    public String mono(){
        return "hello webflux";
    }
    @GetMapping("test")
    public String test(){
        return "hello test";
    }
}
