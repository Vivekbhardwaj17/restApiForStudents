package com.springexample.SpringRestApi.controller;

import com.springexample.SpringRestApi.model.Student;
import com.springexample.SpringRestApi.service.studentoperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private studentoperations stud;

    @GetMapping("/hello")
    public String hello(){
        return "Hello! you are on correct page";
    }
    @GetMapping("/students")
    public List<Student> getAllStudent(){
        return stud.getAllStudents();
    }

    @GetMapping("/student/{studentId}")
    public Student getStudentById(@PathVariable String studentId){
        return stud.getById(Long.parseLong(studentId));
    }

}
