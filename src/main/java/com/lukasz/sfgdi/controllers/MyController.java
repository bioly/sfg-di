package com.lukasz.sfgdi.controllers;

import com.lukasz.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        System.out.println(greetingService.sayGreeting());
        return greetingService.sayGreeting();
    }
}
