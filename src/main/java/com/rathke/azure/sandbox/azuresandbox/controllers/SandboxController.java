package com.rathke.azure.sandbox.azuresandbox.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class SandboxController {
    @GetMapping("/")
    String main(Model model) {
        // this is the file name of the view / template
        return "index";
    }
}
