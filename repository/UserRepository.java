package com.keyin.fullstack_springboot_java_react.repository;


import com.keyin.fullstack_springboot_java_react.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long>{
}
