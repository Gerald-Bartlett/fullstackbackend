package com.keyin.fullstack_springboot_java_react.controller;
import com.keyin.fullstack_springboot_java_react.exception.StudentNotFoundException;
import com.keyin.fullstack_springboot_java_react.repository.StudentRepository;
import com.keyin.fullstack_springboot_java_react.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("http://localhost:3000")  // connects back end to front end on port 3000
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/student")
    Student newStudent(@RequestBody Student newStudent) {
        return studentRepository.save(newStudent);
    }

    @GetMapping("/students")
    List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    @GetMapping("/student/{id}")
    Student getStudentById(@PathVariable Long id){
        return studentRepository.findById(id)
                .orElseThrow(()->new StudentNotFoundException(id));
    }
    @DeleteMapping("/student/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteStudent(@PathVariable Long id){
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));
        studentRepository.delete(student);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
