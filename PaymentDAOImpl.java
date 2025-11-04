package com.college.dao;

import com.college.entity.Payment;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class PaymentDAOImpl implements PaymentDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void save(Payment payment) {
        em.persist(payment);
    }

    @Override
    public List<Payment> getAll() {
        return em.createQuery("from Payment", Payment.class).getResultList();
    }
}
