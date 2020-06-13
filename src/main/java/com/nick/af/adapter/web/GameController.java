package com.nick.af.adapter.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    @GetMapping("/")
    public String viewScore() {
        return "0";
    }
}
