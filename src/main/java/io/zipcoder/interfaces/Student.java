package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    private double totalStudyTime;

    public Student (long id){
        super(id);
    }
    public Student(long id, double totalStudyTime){
        super(id);
        this.totalStudyTime = totalStudyTime;
    }

    public void learn(double numberOfHours){
         totalStudyTime =numberOfHours+totalStudyTime;
    }

    public double getTotalStudyTime(){
        return totalStudyTime;
    }


}
