package com.groceryToHome.user.login;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
class LoginResponse {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String gender;
    private String userId;
    private String emailId;
}
