package com.lrodrigues.waldofish.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

  @RequestMapping("/hello")
  private String hello() {
    return "Hello";
  }
}
