package com.stn.springbootdemo.dao;

import com.stn.springbootdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRep extends JpaRepository<User,Integer> {
    public User findByName(String name);
    public List<User> findAllByName(String name);
    public User deleteByName(String name);

}
