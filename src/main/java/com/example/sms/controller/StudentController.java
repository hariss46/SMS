package com.example.sms.controller;

import com.example.sms.model.StudentDetails;
import com.example.sms.model.StudentFees;
import com.example.sms.service.StudentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentDetailsService stuservice;
    @GetMapping("/SMS/getallstudentdetails")
    public List<StudentDetails> readallStudentDetails() {
        return stuservice.getallStudentDetails();
    }
    @GetMapping("/SMS/getStudentDetailsById")
    public StudentDetails getStudentDetailsById(@RequestParam("stuid") int id){
        return stuservice.getStudentDetailsById(id);
    }
    @PostMapping("/SMS/saveStudentDetails")
    public String saveStudentDetails(@RequestBody StudentDetails stuobj){

        try {
            stuservice.saveStudentDetails(stuobj);
        }catch (Exception e){
            return "Failure";
        }
         return "Success";
    }
    @DeleteMapping("/SMS/deleteStudentDetails/{idd}")
    public String deleteStudentDetails(@PathVariable("idd") int studentid){
        try{
            stuservice.deleteStudentDetails(studentid);
        }catch (Exception e){
            return "Failure";
        }
         return "Success";
    }
    @PostMapping("/SMS/saveStudentFess")
    public String saveStudentFess(@RequestBody StudentFees feesobj ){
        try {
            stuservice.saveStudentFees(feesobj);
        }catch (Exception e){
            return "Failure";
        }
        return "Success";
    }
    @GetMapping("/SMS/getStudentFeesById")
    public double getStudentFeesById(@RequestParam("feesid") int id){
        return  stuservice.getStudentFeesById(id);
    }

}
