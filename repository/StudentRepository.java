package com.keyin.fullstack_springboot_java_react.repository;

import com.keyin.fullstack_springboot_java_react.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
