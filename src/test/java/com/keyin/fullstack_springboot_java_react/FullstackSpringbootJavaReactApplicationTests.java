package com.keyin.fullstack_springboot_java_react;

import com.keyin.fullstack_springboot_java_react.model.Student;
import com.keyin.fullstack_springboot_java_react.model.User;
import com.keyin.fullstack_springboot_java_react.repository.StudentRepository;
import com.keyin.fullstack_springboot_java_react.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FullstackSpringbootJavaReactApplicationTests {

	@Autowired
	StudentRepository studentRepository;

	@Test
	public void testCreate() {
		Student s = new Student();
		s.setId(75L);
		s.setUsername("RickBob");
		s.setName("Ricky Bobby");
		s.setEmail("rick@bob.com");
		s.setCampus_location("St.John's");
		s.setProgram("Dental Assistant");
		studentRepository.save(s);
		Assertions.assertNotNull(studentRepository.findById(75L));

	}


	@Autowired
	UserRepository userRepository;

	@Test
	public void userTestCreate() {
		User u = new User();
		u.setId(14L);
		u.setUsername("myUserName");
		u.setPassword("myUserPassword");
		userRepository.save(u);
		Assertions.assertNotNull(userRepository.findById(14L));
	}

}
