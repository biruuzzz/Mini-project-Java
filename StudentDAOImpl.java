package com.college.dao;

import com.college.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class StudentDAOImpl implements StudentDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Student student) {
        em.persist(student);
    }

    @Override
    public void update(Student student) {
        em.merge(student);
    }

    @Override
    public void delete(int studentId) {
        Student student = em.find(Student.class, studentId);
        if(student != null) em.remove(student);
    }

    @Override
    public Student getById(int studentId) {
        return em.find(Student.class, studentId);
    }

    @Override
    public List<Student> getAll() {
        return em.createQuery("from Student", Student.class).getResultList();
    }
}
