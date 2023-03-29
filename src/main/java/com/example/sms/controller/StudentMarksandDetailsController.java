package com.example.sms.controller;

import com.example.sms.dto.StuMarksDetails;
import com.example.sms.service.StudentDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentMarksandDetailsController {
    @Autowired
    private StudentDetailsService stuservice;

    @PostMapping("/SMS/saveMarksDetails")
    public String saveMarksDetails(@RequestBody StuMarksDetails stuobjj){
        try {
            stuservice.saveMarksAndDetails(stuobjj);
        }catch (Exception e){
            return "Failure";
        }
        return "Success";
    }

    @GetMapping("/SMS/getPercentage")
    public Double calculatePercentage(@RequestParam("stuid") int id){
        double percentage = stuservice.getPercentage(id);
        return percentage;
    }

    @DeleteMapping("/SMS/admindelete")
    public String deleteStudentDetails(@RequestParam("stuid") int ssid, @RequestParam("admid") int adid){
        return stuservice.deleteStudent(ssid, adid);
    }
    @GetMapping("/SMS/discoutOnFees")
    public Double discoutOnFees(@RequestParam("stuid") int id){
        double updatedFees = stuservice.getDiscountOnFees(id);
        return updatedFees;
    }
}
