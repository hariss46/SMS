package com.example.sms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentFees {

    @Id
    int studentid;

    int totalfess;

    int feespaidtillnow;

    int remainingfess;

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public int getTotalfess() {
        return totalfess;
    }

    public void setTotalfess(int totalfess) {
        this.totalfess = totalfess;
    }

    public int getFeespaidtillnow() {
        return feespaidtillnow;
    }

    public void setFeespaidtillnow(int feespaidtillnow) {
        this.feespaidtillnow = feespaidtillnow;
    }

    public int getRemainingfess() {
        return remainingfess;
    }

    public void setRemainingfess(int remainingfess) {
        this.remainingfess = remainingfess;
    }

    public StudentFees(int studentid, int totalfess, int feespaidtillnow, String isfeespaidstatus) {
        this.studentid = studentid;
        this.totalfess = totalfess;
        this.feespaidtillnow = feespaidtillnow;
        this.remainingfess = remainingfess;
    }

    public StudentFees(){

    }
}
