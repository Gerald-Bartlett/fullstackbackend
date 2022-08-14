package com.keyin.fullstack_springboot_java_react.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String name;
    private String email;

    private String campus_location;

    private String program;

    public String getCampus_location() {
        return campus_location;
    }

    public void setCampus_location(String campus_location) {
        this.campus_location = campus_location;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
