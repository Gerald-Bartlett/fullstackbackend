package com.keyin.fullstack_springboot_java_react.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("could not find the User with id" + id);
    }
}
