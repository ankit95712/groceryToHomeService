package com.groceryToHome.user.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "USERS_DETAILS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    public Users(String firstName, String lastName, String phoneNumber,
                 String gender, String userId, String emailId, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.userId = userId;
        this.emailId = emailId;
        this.password = password;
    }

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "EMAIL_ID")
    private String emailId;

    @Column(name = "PASSWORD")
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private Roles role;
}
