package com.groceryToHome.user.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/login")
    String all() {
        return "You are logged in";
    }
}
