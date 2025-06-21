package com.tylerspub.revamped.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GamedayMenuController {
    @GetMapping("/gameday")
    public String Gameday() {
        return "gamedaymenu";
    }
}
