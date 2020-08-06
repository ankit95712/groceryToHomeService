package com.groceryToHome.user.login;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoginService {

    public LoginRequest getUserDetails(String username, String password) throws Exception {
        List<LoginRequest> loginRequestList = new ArrayList<>();
        loginRequestList.add(new LoginRequest("Ankit", "Singh", "9808900044", "Male", "ankit", "ankit@gmail.com", "ankit"));
        loginRequestList.add(new LoginRequest("Vivek", "Kumar", "9808900044", "Male", "vivek", "vivek@gmail.com", "vivek"));
        return loginRequestList.stream()
                .filter(loginRequest -> loginRequest.getUserId().equals(username)
                        && loginRequest.getPassword().equals(password))
                .findFirst()
                .orElseThrow(Exception::new);
    }
}
