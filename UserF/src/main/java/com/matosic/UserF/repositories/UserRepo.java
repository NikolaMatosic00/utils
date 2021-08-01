package com.matosic.UserF.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matosic.UserF.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
