package com.keyin.fullstack_springboot_java_react.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    public void testStudentFirstName(){
        Student studentUnderTest = new Student();
        Assertions.assertNotEquals(87, studentUnderTest.getName());
        Assertions.assertEquals(studentUnderTest.getName(), studentUnderTest.getName());
    }

    @Test
    public void testStudentId(){
        Student studentUnderTest = new Student();
        Assertions.assertNotEquals("Joe", studentUnderTest.getId());
        Assertions.assertEquals(studentUnderTest.getId(), studentUnderTest.getId());


    }

    @Test
    public void testEmail(){
        Student studentUnderTest = new Student();
        Assertions.assertNotEquals(99,studentUnderTest.getEmail());
        Assertions.assertEquals(studentUnderTest.getEmail(), studentUnderTest.getEmail());
    }
}
