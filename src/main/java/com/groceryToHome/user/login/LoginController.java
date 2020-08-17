package com.groceryToHome.user.login;

import com.groceryToHome.user.domain.UserDomain;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class LoginController {
    private LoginService loginService;
    private LoginRepository loginRepository;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/login/{id}/{password}")
    public LoginResponse loginUser(@PathVariable String id,
                                  @PathVariable String password) throws Exception {
        return loginService.getUserDetails(id, password);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/login")
    public List<UserDomain> login() throws Exception {
        UserDomain userDomain = new UserDomain("Anki", "Sing", "9090", "female", "as@sxcds.com", "ankit", "ankit");
        loginRepository.save(userDomain);
        return loginRepository.findAll();
    }
}
