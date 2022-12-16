package com.example.todoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {
    @GetMapping
    public String hello() {
        return "To-do Application!";
    }
}
