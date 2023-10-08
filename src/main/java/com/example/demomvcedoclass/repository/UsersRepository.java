package com.example.demomvcedoclass.repository;

import com.example.demomvcedoclass.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Long> {
}
