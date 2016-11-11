package com.tegess.api;

import com.tegess.api.request.HelloWorld;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
    public HelloWorld helloWorld() {
        return new HelloWorld("Szymek");
    }
}
