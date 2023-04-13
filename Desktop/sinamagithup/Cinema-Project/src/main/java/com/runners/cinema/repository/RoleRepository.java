package com.runners.cinema.repository;

import com.runners.cinema.model.Role;
import com.runners.cinema.model.enums.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByType(RoleType roleType);
}
