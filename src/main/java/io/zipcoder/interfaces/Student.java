package io.zipcoder.interfaces;

public class Student extends Person implements Learner{//this student class is public which extends from Person which implements learner
    private double totalStudyTime;

    public Student (long id){
        super(id);
    }
    public void learn(double numberOfHours){
        totalStudyTime += numberOfHours;

    }
    public double getTotalStudyTime(){
        return totalStudyTime;
    }

}
