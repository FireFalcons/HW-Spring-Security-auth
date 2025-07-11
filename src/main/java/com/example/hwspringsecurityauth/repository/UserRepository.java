package com.example.hwspringsecurityauth.repository;

import com.example.hwspringsecurityauth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
