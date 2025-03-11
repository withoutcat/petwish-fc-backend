package com.withoutcat.petwish.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthzController {

  @GetMapping("/healthz")
  public String healthzCheck() {
    return "这里是withoutcat的健康检查";
  }
}
