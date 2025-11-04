package com.college.dao;

import com.college.entity.Student;
import java.util.List;

public interface StudentDAO {
    void save(Student student);
    void update(Student student);
    void delete(int studentId);
    Student getById(int studentId);
    List<Student> getAll();
}
