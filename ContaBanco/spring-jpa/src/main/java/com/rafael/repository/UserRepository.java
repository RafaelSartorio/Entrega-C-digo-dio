package com.rafael.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.rafael.Modelo.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
