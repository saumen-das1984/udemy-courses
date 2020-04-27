package guru.springframework.udemy.controllers;

import guru.springframework.udemy.services.GreetingService;

/**
 * Created by jt on 12/26/19.
 */
public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
