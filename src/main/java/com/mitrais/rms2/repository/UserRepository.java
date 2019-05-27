package com.mitrais.rms2.repository;

import com.mitrais.rms2.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
