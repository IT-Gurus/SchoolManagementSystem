package com.school.junior.repository;

import com.school.junior.model.FeesPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeesPaymentRepository extends JpaRepository<FeesPayment,Long> {
    FeesPayment findByStudentId(int studentId);

    List<FeesPayment> findAllByFeesBalance(double feesBalance);
}
