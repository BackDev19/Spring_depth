package com.sparta.jpa.repository;

import com.sparta.jpa.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, String> {
    List<Users> findByFavoriteFoodContaining(String word);
}
