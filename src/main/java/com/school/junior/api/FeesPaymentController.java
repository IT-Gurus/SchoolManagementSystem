package com.school.junior.api;

import com.school.junior.model.FeesPayment;
import com.school.junior.model.Student;
import com.school.junior.service.FeesPaymentService;
import com.school.junior.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/fees")
@CrossOrigin(allowedHeaders = "*",allowCredentials = "",methods = RequestMethod.GET,origins ="*")
public class FeesPaymentController {

    private final StudentService studentService;
    private final FeesPaymentService feesPaymentService;

    @Autowired
    public FeesPaymentController(StudentService studentService, FeesPaymentService feesPaymentService) {
        this.studentService = studentService;
        this.feesPaymentService = feesPaymentService;
    }

   /* @PostMapping()
    public FeesPayment initiateFeesPayment(){

    }*/

    @PostMapping(value = "/payfees")
    public FeesPayment payFees(@RequestBody FeesPayment feesPayment) {
        feesPaymentService.save(feesPayment);
        return feesPayment;
    }

    @GetMapping(value = "/{studentId}")
    public FeesPayment getFeesDetailsByStudentId(@PathVariable  Integer studentId) {

        final FeesPayment feesDetailsByStudentId = feesPaymentService.getFeesDetailsByStudentId(studentId);
      /*  if(feesDetailsByStudentId !=null){
            return new FeesPayment();
        }*/

        return feesDetailsByStudentId;

    }

    @GetMapping(value = "/allFeesPayments")
   public List<FeesPayment> findAllFeesStatements(){
       return feesPaymentService.findAllFeesPayments();

    }

    @GetMapping(value = "/paidfullfees/{feesBalance}")
    public List<Student> findAllStudentsWhoPaidFullFees(@PathVariable  double feesBalance) {
        //first look for feesBalance equalToOrLessThanZero
        //create a list of those students and loop through them and getting all student details using studentId
        //return that List

        //Todo  remove logic from controller to service package
        return fromFeesDetailsToStudentsWhoPaidUp(feesBalance);

    }

    private List<Student> fromFeesDetailsToStudentsWhoPaidUp(double feesBalance) {
        Student student ;
        List<Student> studentsWhoPaidUpFees = new ArrayList<>();
        List<FeesPayment> feesDetailsOfStudentsWhoPaidUpFees = feesPaymentService.findFeesDetailsWithFeesEqualToOrLessThanZero(feesBalance);
        //get the studentIds of those students with equalToOrLessThanZero
        for (FeesPayment feesDetails : feesDetailsOfStudentsWhoPaidUpFees) {
            student = studentService.findByStudentId(feesDetails.getStudentId());

                studentsWhoPaidUpFees.add(student);


        }
        return studentsWhoPaidUpFees;
    }

//Todo run a query for students with 0 and a negative balance ie extra fees in their accouts

}
