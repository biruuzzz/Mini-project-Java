package com.college.dao;

import com.college.entity.Payment;
import java.util.List;

public interface PaymentDAO {
    void save(Payment payment);
    List<Payment> getAll();
}
