package com.keyin.fullstack_springboot_java_react.exception;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(Long id){
        super("could not find the Student with id" + id);
    }
}
