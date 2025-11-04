package com.college.dao;

import com.college.entity.Course;
import java.util.List;

public interface CourseDAO {
    void save(Course course);
    List<Course> getAll();
    Course getById(int courseId);
}
