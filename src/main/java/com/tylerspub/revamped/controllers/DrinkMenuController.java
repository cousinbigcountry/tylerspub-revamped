package com.tylerspub.revamped.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DrinkMenuController {
    @GetMapping("/drinks")
    public String Drinks() {
        return "drinkmenu";
    }
}
