package com.springexample.SpringRestApi.service;

import com.springexample.SpringRestApi.model.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Component
public class StudentOperationsImple implements studentoperations{

    private List<Student> list = new ArrayList<>();

    public StudentOperationsImple() {
        list.add(new Student(171500394,"B.Tech","CSE"));
        list.add(new Student(171500395,"B.Tech","MECH"));
        list.add(new Student(171500395,"B.Tech","ECE"));
    }

    @Override
    public List<Student> getAllStudents() {
        return this.list;
    }

    @Override
    public List<Student> getByDepartment() {
        return null;
    }

    @Override
    public Student getById(Long studentId) {
        for(Student student:list){
            if(student.getStudentId() == studentId)
                return student;
        }
        return null;
    }
}
