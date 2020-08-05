package com.groceryToHome.user.login;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class LoginController {
    private LoginService loginService;

    @GetMapping("/login")
    public LoginRequest loginUser() {
        return loginService.getUserDetails();
    }
}
