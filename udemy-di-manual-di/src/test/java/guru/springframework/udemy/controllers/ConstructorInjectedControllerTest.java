package guru.springframework.udemy.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.udemy.controllers.ConstructorInjectedController;
import guru.springframework.udemy.services.GreetingServiceImpl;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());

    }
}