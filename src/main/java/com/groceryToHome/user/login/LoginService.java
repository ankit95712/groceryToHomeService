package com.groceryToHome.user.login;

import com.groceryToHome.user.domain.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
class LoginService {
    private final LoginRepository loginRepository;

    LoginResponse getUserDetails(String username, String password) throws Exception {
        List<LoginResponse> loginRequestList = new ArrayList<>();
        loginRequestList.add(new LoginResponse("Ankit", "Singh", "9808900044", "Male", "ankit", "ankit@gmail.com"));
        loginRequestList.add(new LoginResponse("Vivek", "Kumar", "9808900044", "Male", "vivek", "vivek@gmail.com"));
        return loginRequestList.stream()
                .filter(loginRequest -> loginRequest.getUserId().equals(username))
                .findFirst()
                .orElseThrow(Exception::new);
    }

    List<Users> getUsers() {
        return loginRepository.findAll();
    }
}
