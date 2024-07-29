package com.convin.Convin.repository;

import com.convin.Convin.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
    // You can add custom query methods here if needed
}
