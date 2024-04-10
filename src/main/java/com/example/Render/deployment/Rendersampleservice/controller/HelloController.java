package com.example.Render.deployment.Rendersampleservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Render-service")
public class HelloController {


    @GetMapping("/hello")
    public String sayHelloToUser(@RequestParam String username){
        return "hello  " + username;
    }
    @GetMapping("/bye")
    public String sayByeToUser(@RequestParam String username){
        return "bye  " + username;
    }
}
