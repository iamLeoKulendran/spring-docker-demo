package com.iamleo.restfullwebservices.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
@Autowired
private HelloWorldBean  helloWorldBean;

    @GetMapping("hello-world")
    public String helloworld() {

        return "Hello World in28minitus !";
    }



    @GetMapping("hello-world-bean")
    public HelloWorldBean helloworldBean() {
        helloWorldBean.setMessage("Hello World !!");
        return helloWorldBean;

    }



}
