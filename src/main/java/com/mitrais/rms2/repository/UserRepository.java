package com.mitrais.rms2.repository;

import com.mitrais.rms2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


//public interface UserRepository extends CrudRepository<User, Long> { }

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}