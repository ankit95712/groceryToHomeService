package com.groceryToHome.user.login;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class LoginRequest {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String gender;
    private String userId;
    private String emailId;
}
