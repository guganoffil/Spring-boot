package com.example.demo.Dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.User;

public interface Userdao extends CrudRepository<User, Integer> {

}
