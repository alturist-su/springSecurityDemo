package com.spring.security.springSecurity.controller;

import com.spring.security.springSecurity.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    //define some students
    public List<Student> students = new ArrayList<>(List.of(
            new Student(1, "John", 90),
            new Student(2, "Jane", 85),
            new Student(3, "Tom", 78),
            new Student(4, "Lucy", 92)
    ))git ;

    //getting all students
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return students;
    }

    //get csrf token
    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    //create a new student
    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }

}
