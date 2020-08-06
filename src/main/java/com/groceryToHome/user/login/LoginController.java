package com.groceryToHome.user.login;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class LoginController {
    private LoginService loginService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/login/{id}/{password}")
    public LoginRequest loginUser(@PathVariable String id,
                                  @PathVariable String password) throws Exception {
        return loginService.getUserDetails(id, password);
    }
}
