package com.lukasz.sfgdi.controllers;

import com.lukasz.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class ConstructorInjectedController {
    private final GreetingService service;

//    @Autowired
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService service) {
        this.service = service;
    }

    public String getGreeting(){
        return service.sayGreeting();
    }
}
