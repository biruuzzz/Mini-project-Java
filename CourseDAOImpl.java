package com.college.dao;

import com.college.entity.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class CourseDAOImpl implements CourseDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Course course) {
        em.persist(course);
    }

    @Override
    public List<Course> getAll() {
        return em.createQuery("from Course", Course.class).getResultList();
    }

    @Override
    public Course getById(int courseId) {
        return em.find(Course.class, courseId);
    }
}
