package com.tylerspub.revamped.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodMenuController {
    @GetMapping("/food")
    public String Food() {
        return "foodmenu";
    }
}
