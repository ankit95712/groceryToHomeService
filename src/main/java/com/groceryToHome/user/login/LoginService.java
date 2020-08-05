package com.groceryToHome.user.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    public LoginRequest getUserDetails() {
        return new LoginRequest("Ankit", "Singh", "9808900044", "Male", "ankit213", "ankit@gmail.com");
    }
}
