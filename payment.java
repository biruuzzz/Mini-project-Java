package com.college.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentId;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    private double amount;

    private LocalDate date;

    public Payment() {}
    public Payment(Student student, double amount, LocalDate date) {
        this.student = student;
        this.amount = amount;
        this.date = date;
    }

    // getters and setters
    public int getPaymentId() { return paymentId; }
    public void setPaymentId(int paymentId) { this.paymentId = paymentId; }

    public Student getStudent() { return student; }
    public void setStudent(Student student) { this.student = student; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    @Override
    public String toString() {
        return "Payment [paymentId=" + paymentId + ", student=" + student.getName() + ", amount=" + amount + ", date=" + date + "]";
    }
}
