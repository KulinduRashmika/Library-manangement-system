package com.user.demo.data;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByUserNameContainingIgnoreCase(String name);
}