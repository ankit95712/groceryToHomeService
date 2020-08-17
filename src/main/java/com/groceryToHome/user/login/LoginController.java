package com.groceryToHome.user.login;

import com.groceryToHome.user.domain.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LoginController {
    private final LoginService loginService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/login/{id}/{password}")
    public LoginResponse loginUser(@PathVariable String id,
                                  @PathVariable String password) throws Exception {
        return loginService.getUserDetails(id, password);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/users")
    public List<Users> login() {
        return loginService.getUsers();
    }
}
