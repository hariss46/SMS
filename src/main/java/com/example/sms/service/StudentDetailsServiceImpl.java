package com.example.sms.service;

import com.example.sms.dto.StuMarksDetails;
import com.example.sms.model.Admin;
import com.example.sms.model.Marks;
import com.example.sms.model.StudentDetails;
import com.example.sms.model.StudentFees;
import com.example.sms.repository.AdminRepo;
import com.example.sms.repository.MarksRepo;
import com.example.sms.repository.StudentDetailsRepo;
import com.example.sms.repository.StudentFeesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentDetailsServiceImpl implements StudentDetailsService {

    @Autowired
    private StudentDetailsRepo sturepo;
    @Autowired
    private MarksRepo marksRepo;
    @Autowired
    private AdminRepo adminRepo;
    @Autowired
    private StudentFeesRepo feesRepo;

    @Override
    public List<StudentDetails> getallStudentDetails() {
        return sturepo.findAll();
    }

    @Override
    public StudentDetails getStudentDetailsById(int id) {
        return sturepo.findById(id).get();
    }

    @Override
    public void saveStudentDetails(StudentDetails stuobj) {
        sturepo.save(stuobj);
    }

    @Override
    public void deleteStudentDetails(int studentid) {
        sturepo.deleteById(studentid);
    }

    @Override
    public void saveMarksAndDetails(StuMarksDetails stuobjj) {
        StudentDetails student = new StudentDetails();
        student.setEmail(stuobjj.getEmail());
        student.setName(stuobjj.getName());
        student.setPhoneno(stuobjj.getPhoneno());
        student.setRollno(stuobjj.getRollno());
        student.setStudentid(stuobjj.getStudentid());

        Marks marks = new Marks();
        marks.setEng(stuobjj.getEng());
        marks.setChem(stuobjj.getChem());
        marks.setHindi(stuobjj.getHindi());
        marks.setScience(stuobjj.getScience());
        marks.setPhy(stuobjj.getPhy());
        marks.setMaths(stuobjj.getMaths());
        marks.setStudentid(stuobjj.getStudentid());

        sturepo.save(student);
        marksRepo.save(marks);
    }

    @Override
    public double getPercentage(int per) {
        Marks marks = marksRepo.findById(per).get();
        double total = marks.getEng() + marks.getHindi() + marks.getScience() + marks.getMaths() + marks.getPhy() + marks.getChem();
        double percentage = total / 6;
        return percentage;
    }

    @Override
    public String deleteStudent(int ssid, int adid) {
        Admin adm = adminRepo.findById(adid).get();

        if ("Y".equals(adm.getAccessStatus())) {
            sturepo.deleteById(ssid);
        } else {
            return "You Can Not Delete ";
        }

        return "Successfully Deleted";
    }

    @Override
    public void saveStudentFees(StudentFees feesobj) {
        StudentFees fees = new StudentFees();
        fees.setTotalfess(feesobj.getTotalfess());
        fees.setFeespaidtillnow(feesobj.getFeespaidtillnow());
        fees.setRemainingfess(feesobj.getRemainingfess());
        fees.setStudentid(feesobj.getStudentid());

        feesRepo.save(feesobj);
    }

    @Override
    public double getStudentFeesById(int id) {
        StudentFees studentFees = feesRepo.findById(id).get();
        double remainingFees = studentFees.getTotalfess() - studentFees.getFeespaidtillnow();
        return remainingFees;
    }

    @Override
    public double getDiscountOnFees(int id) {
        Marks marks = marksRepo.findById(id).get();
        double total = marks.getEng() + marks.getHindi() + marks.getScience() + marks.getMaths() + marks.getPhy() + marks.getChem();
        double percentage = total / 6;

        System.out.println(percentage);
        StudentFees studentFees = feesRepo.findById(id).get();
        double remainingFees = studentFees.getTotalfess() - studentFees.getFeespaidtillnow();

        double discount = 0;

        if (percentage < 50) {
             discount = 0;
        } else if (percentage >= 50 && percentage <= 70) {
            discount = remainingFees * 0.05;
        } else if (percentage >= 70 && percentage <= 90) {
             discount = remainingFees * 0.10;

        } else {
             discount = remainingFees * 0.25;
        }
        return remainingFees - discount;
    }

}



