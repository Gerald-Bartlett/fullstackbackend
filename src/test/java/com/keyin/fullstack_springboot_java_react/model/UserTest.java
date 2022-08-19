package com.keyin.fullstack_springboot_java_react.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void testId(){
        User userUnderTest = new User();
        Assertions.assertNotEquals("Fred", userUnderTest.getId());
        Assertions.assertEquals(userUnderTest.getId(), userUnderTest.getId());
    }

    @Test
    public void testUserName(){
        User userUnderTest = new User();
        Assertions.assertNotEquals(34, userUnderTest.getUsername());
        Assertions.assertEquals(userUnderTest.getUsername(), userUnderTest.getUsername());
    }

    @Test
    public void testPassword(){
        User userUnderTest = new User();
        Assertions.assertNotEquals(78, userUnderTest.getPassword());
        Assertions.assertEquals(userUnderTest.getPassword(), userUnderTest.getPassword());
    }


}
