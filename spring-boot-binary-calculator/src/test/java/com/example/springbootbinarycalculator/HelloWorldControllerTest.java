package com.example.springbootbinarycalculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.example.springbootbinarycalculator.controller.HelloWorldController;

public class HelloWorldControllerTest {

    @Test
    public void testHelloWorldController() {
        HelloWorldController helloWorldController = new HelloWorldController();
        String helloResult = helloWorldController.HelloWorld();
        assertEquals(helloResult, "Hello World");

    }

}
