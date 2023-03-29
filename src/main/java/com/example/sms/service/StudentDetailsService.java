package com.example.sms.service;

import com.example.sms.dto.StuMarksDetails;
import com.example.sms.model.StudentDetails;
import com.example.sms.model.StudentFees;

import java.util.List;

public interface StudentDetailsService {

    public List<StudentDetails> getallStudentDetails();

    public StudentDetails getStudentDetailsById(int id);

    public void saveStudentDetails(StudentDetails stuobj);

    public void deleteStudentDetails(int studentid);

    public void saveMarksAndDetails(StuMarksDetails stuobjj);

    public double getPercentage(int per);

    public String deleteStudent(int ssid, int adid);

    public  void  saveStudentFees(StudentFees feesobj);

    public double getStudentFeesById(int id);

    public double getDiscountOnFees(int id);
}
