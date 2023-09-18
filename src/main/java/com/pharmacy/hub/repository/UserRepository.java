package com.pharmacy.hub.repository;

import com.pharmacy.hub.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
