package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRespositroy extends CrudRepository<User, Long> {
    public User getUserById(Long id);
    public User getUserByEmail(Long email);
    public boolean existsUserByUsername(String username);
    public boolean existsUserByEmail(String email);

}
