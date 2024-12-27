package com.blogApp.amol.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blogApp.amol.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
