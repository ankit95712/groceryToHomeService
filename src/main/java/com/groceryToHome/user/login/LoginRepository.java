package com.groceryToHome.user.login;

import com.groceryToHome.user.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface LoginRepository extends JpaRepository<Users, Long> {

}
