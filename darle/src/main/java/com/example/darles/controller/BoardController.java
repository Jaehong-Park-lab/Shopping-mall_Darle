package com.example.darles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

  @GetMapping("/event")
  public String getEvent() {

    return "board/event";
  }
}