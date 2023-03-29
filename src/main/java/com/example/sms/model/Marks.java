package com.example.sms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Marks {
    @Id
    int studentid;

    int eng;

    int maths;

    int science;

    int hindi;

    int phy;

    int chem;

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getScience() {
        return science;
    }

    public void setScience(int science) {
        this.science = science;
    }

    public int getHindi() {
        return hindi;
    }

    public void setHindi(int hindi) {
        this.hindi = hindi;
    }

    public int getPhy() {
        return phy;
    }

    public void setPhy(int phy) {
        this.phy = phy;
    }

    public int getChem() {
        return chem;
    }

    public void setChem(int chem) {
        this.chem = chem;
    }

    public Marks(int studentid, int eng, int maths, int science, int hindi, int phy, int chem) {
        this.studentid = studentid;
        this.eng = eng;
        this.maths = maths;
        this.science = science;
        this.hindi = hindi;
        this.phy = phy;
        this.chem = chem;
    }

    public Marks(){

    }
}
