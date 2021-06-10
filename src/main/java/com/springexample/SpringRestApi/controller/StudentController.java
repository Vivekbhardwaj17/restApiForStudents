package com.springexample.SpringRestApi.controller;

import com.springexample.SpringRestApi.model.Student;
import com.springexample.SpringRestApi.service.studentoperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private studentoperations stud;

    @GetMapping("/hello")
    public String hello(){
        return "Hello! you are on correct page";
    }

    @GetMapping("/hellos")
    public String helloRes(@RequestParam String str){
        return str +"is a university";
    }

    @GetMapping("/students")
    public List<Student> getAllStudent(){
        return stud.getAllStudents();
    }

    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable String studentId){
        return stud.getById(Long.parseLong(studentId));
    }

    @GetMapping("/students/{departmentId}")
    public List<Student> getStudentByDept(@PathVariable String departmentId){
        return stud.getByDepartment(departmentId);
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        return stud.addStudent(student);
    }

    @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student){
        return stud.updateStudent(student);
    }

    @DeleteMapping("/students/{studentId}")
    public List<Student> deleteStudent(@PathVariable String studentId ){
        return stud.removeStudent(Long.parseLong(studentId));
    }

}
