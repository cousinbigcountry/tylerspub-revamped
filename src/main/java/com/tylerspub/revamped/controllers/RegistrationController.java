package com.tylerspub.revamped.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {
    @GetMapping("/registration")
    public String Registration() {
        return "registration";
    }
}
