package com.springexample.SpringRestApi.model;

public class Student {
    private long studentId;
    private String course;
    private String department;

    public Student(final long studentId, final String course, final String department) {
        this.studentId = studentId;
        this.course = course;
        this.department = department;
    }

    public Student() {

    }

    public long getStudentId() {
        return this.studentId;
    }

    public void setStudentId(final long studentId) {
        this.studentId = studentId;
    }

    public String getCourse() {
        return this.course;
    }

    public void setCourse(final String course) {
        this.course = course;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(final String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", course='" + course + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
