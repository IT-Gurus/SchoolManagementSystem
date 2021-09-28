package com.school.junior.service;

import com.school.junior.model.FeesPayment;
import com.school.junior.repository.FeesPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FeesPaymentService {
    private final FeesPaymentRepository feesPaymentRepository;

    @Autowired
    public FeesPaymentService(FeesPaymentRepository feesPaymentRepository) {
        this.feesPaymentRepository = feesPaymentRepository;
    }

    public void save(FeesPayment feesPayment) {
        feesPaymentRepository.save(feesPayment);
    }

    public FeesPayment getFeesDetailsByStudentId(Integer studentId) {
        return feesPaymentRepository.findByStudentId(studentId);
    }


    public List<FeesPayment> findFeesDetailsWithFeesEqualToOrLessThanZero(double feesBalance) {

        List<FeesPayment> feesFullyPaidDetails = feesPaymentRepository.findAll()
                .stream().filter(feesPayment -> feesPayment.getFeesBalance() <= 0.0)
               // .map( )
                .collect(Collectors.toList());
        // .allMatch(feesPayment -> feesPayment.getFeesBalance() <= 0.0);


       // return feesPaymentRepository.findAllByFeesBalance(feesBalance);
        return  feesFullyPaidDetails;

    }

    public List<FeesPayment> findAllFeesPayments() {
      return   feesPaymentRepository.findAll();
    }
}
