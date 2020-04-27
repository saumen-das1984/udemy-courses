package guru.springframework.udemy.controllers;

import guru.springframework.udemy.services.GreetingService;

/**
 * Created by jt on 12/26/19.
 */
public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
