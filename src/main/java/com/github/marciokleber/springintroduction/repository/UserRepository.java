package com.github.marciokleber.springintroduction.repository;

import com.github.marciokleber.springintroduction.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User, Long> {
}
