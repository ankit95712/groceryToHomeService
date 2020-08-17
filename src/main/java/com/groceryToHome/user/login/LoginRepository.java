package com.groceryToHome.user.login;

import com.groceryToHome.user.domain.UserDomain;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoginRepository extends JpaRepository<UserDomain, Long> {
    List<UserDomain> findAll();
    UserDomain save(UserDomain userDomain);
}
