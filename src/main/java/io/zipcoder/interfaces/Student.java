package io.zipcoder.interfaces;

import interfaces.Learner;

public class Student extends Person implements Learner {

    double totalStudyTime;

//-----------  constructor --------------------
    public Student(Long id, String name) {
        super(id, name);
    }

//--------------------------------------------



//----------  interfaces -----------------------
    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }


    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
