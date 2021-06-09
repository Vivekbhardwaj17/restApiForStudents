package com.springexample.SpringRestApi.service;

import com.springexample.SpringRestApi.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface studentoperations {
    public List<Student> getAllStudents();
    public List<Student> getByDepartment();
    public Student getById(Long studentId);

}
