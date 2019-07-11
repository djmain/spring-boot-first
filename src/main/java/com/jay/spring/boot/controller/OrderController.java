package com.jay.spring.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by Jay on 2019/7/11
 */
@RestController
public class OrderController
{
    @GetMapping("/order")
    public String get()
    {
        return "Hello, Order.";
    }
}
