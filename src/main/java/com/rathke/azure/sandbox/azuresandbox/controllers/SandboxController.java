package com.rathke.azure.sandbox.azuresandbox.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SandboxController {
    @RequestMapping("/")
    String hello() {
        return "Hello World!";
    }
}
