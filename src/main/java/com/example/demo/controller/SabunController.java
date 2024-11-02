package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SabunController {
    // 사번을 리턴
    @GetMapping("/user")
    public String getUser() {
         return "82230183";
    }
}
