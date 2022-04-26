package com.example.demo.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.example.demo.model.User;

public interface Userrepo extends JpaRepositoryImplementation<User, Long> {

}
