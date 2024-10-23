package com.iamleo.restfullwebservices.helloworld;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldBean {

    private String message;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +  "message='" + message + '\'' +  '}';
    }
}
