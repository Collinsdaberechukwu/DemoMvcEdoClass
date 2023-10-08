package com.example.demomvcedoclass.repository;

import com.example.demomvcedoclass.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Long> {
}
