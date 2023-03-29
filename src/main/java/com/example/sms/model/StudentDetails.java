package com.example.sms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentDetails {
    @Id
    int studentid;

    String  name;

    String email;

    String phoneno;

    String rollno;

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public StudentDetails(int studentid, String name, String email, String phoneno, String rollno) {
        this.studentid = studentid;
        this.name = name;
        this.email = email;
        this.phoneno = phoneno;
        this.rollno = rollno;
    }

    public StudentDetails(){

    }
}
