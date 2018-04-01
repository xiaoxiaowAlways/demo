package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Wolf
 * @date 2018/4/1 9:56
 */
@RestController
@RequestMapping("/index")
public class IndexController {
  @RequestMapping("/index")
  public String index() {
    return "server start success";
  }
}
