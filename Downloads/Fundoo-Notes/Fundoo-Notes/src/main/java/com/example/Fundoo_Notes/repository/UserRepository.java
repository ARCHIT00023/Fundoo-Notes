package com.example.Fundoo_Notes.repository;

import java.util.Optional;

import com.example.Fundoo_Notes.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

 Optional<User> findByEmail(String email);

}