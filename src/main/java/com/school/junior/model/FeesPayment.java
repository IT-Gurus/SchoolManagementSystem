package com.school.junior.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public  class FeesPayment {

    @Id
    private   Long id;
    private  int studentId;
    private  Date paymentDate;
    private double feesAmount;
    private  double totalFees;
    private  double feesBalance;


    public FeesPayment() {

    }

    public FeesPayment(Long id, int studentId, Date paymentDate, double feesAmount, double totalFees, double feesBalance) {
        this.id = id;
        this.studentId = studentId;
        this.paymentDate = paymentDate;
        this.feesAmount = feesAmount;
        this.totalFees = totalFees;
        this.feesBalance = feesBalance;
    }


}
