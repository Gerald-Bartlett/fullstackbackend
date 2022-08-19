package com.keyin.fullstack_springboot_java_react.model;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MockTest {
    @Mock
    Student studentMock = new Student("joan rivers");

    @Test
    public void setStudentMock(){
        Assertions.assertEquals(studentMock.getName(), studentMock.getName());
        Assertions.assertNotEquals(73, studentMock.getName());
    }


    @Mock
    User userMock = new User("daveBarryGerald");

    @Test
    public void setUserMock(){
        Assertions.assertEquals(userMock.getUsername(), userMock.getUsername());
        Assertions.assertNotEquals(73, studentMock.getUsername());
    }


}
