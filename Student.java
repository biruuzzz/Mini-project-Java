package com.college.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    private String name;

    private double balance;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public Student() {}
    public Student(String name, Course course, double balance) {
        this.name = name;
        this.course = course;
        this.balance = balance;
    }

    // getters and setters
    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public Course getCourse() { return course; }
    public void setCourse(Course course) { this.course = course; }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", name=" + name + ", balance=" + balance + ", course=" + course.getCourseName() + "]";
    }
}
