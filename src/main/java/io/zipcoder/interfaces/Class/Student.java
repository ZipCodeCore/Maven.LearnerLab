package io.zipcoder.interfaces.Class;

import io.zipcoder.interfaces.Interface.Learner;

public class Student extends Person implements Learner {
    double totalStudyTime = 0;

    public Student(long id){
        super(id);
    }

    public void learn(double numberOfHours){
        totalStudyTime+=numberOfHours;
    }

    public double getTotalStudyTime(){
        return totalStudyTime;
    }

}
