package com.agriSmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.agriSmart.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}