package com.spring.security.springSecurity.controller;

import com.spring.security.springSecurity.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    //define some students
    public List<Student> students = List.of(
            new Student(1, "John", 90),
            new Student(2, "Jane", 85),
            new Student(3, "Tom", 78),
            new Student(4, "Lucy", 92)
    );

    //getting all students
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return students;
    }

    //create a new student
    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student){
        students.add(student);
        return student;
    }

}
