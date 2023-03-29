package com.example.sms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teachers {
    @Id
    int teacherid;

    String teachername;

    String subject;

    int age;

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teachers(int teacherid, String teachername, String subject, int age) {
        this.teacherid = teacherid;
        this.teachername = teachername;
        this.subject = subject;
        this.age = age;
    }

    public Teachers(){

    }
}
