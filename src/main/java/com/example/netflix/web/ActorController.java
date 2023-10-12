package com.example.netflix.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actor")
public class ActorController {
  

  @GetMapping("/hello")
  public String greetings() {
    return "hello";
  }
}
