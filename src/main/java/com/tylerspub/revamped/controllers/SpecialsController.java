package com.tylerspub.revamped.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpecialsController {
    @GetMapping("/specials")
    public String Specials() {
        return "specials";
    }
}
