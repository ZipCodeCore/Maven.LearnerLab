package io.zipcoder.interfaces;

import java.security.PublicKey;

public class Student extends Person implements Learner {

   Double totalStudyTime;

    public Student(Long id, String name,Double totalStudyTime) {
        super(id, name);
        this.totalStudyTime=totalStudyTime;
    }


    public void learn(double numberOfHours) {
        this.totalStudyTime+=numberOfHours;
    }

    public Double getTotalStudyTime() {
        return this.totalStudyTime;
    }
}
