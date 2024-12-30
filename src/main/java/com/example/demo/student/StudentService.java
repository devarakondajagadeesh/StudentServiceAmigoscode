package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

// @Component // @component means initiating the Class with the Spring Framework
@Service // This is in Spring Boot, this annotation will initiate this Class
public class StudentService {
    public List<Student> getStudentDetails(){
        return List.of(
                new Student(1L, "Jagadeesh Devarakonda", "jagadeesh@example.com", LocalDate.of(2000, 1, 1), 23)
        );
    }
}
