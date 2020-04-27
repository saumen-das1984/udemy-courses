package guru.springframework.udemy.controllers;

import guru.springframework.udemy.services.GreetingService;

/**
 * Created by jt on 12/26/19.
 */
public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
