package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private double totalStudyTime=0;

    public Student(){
        super();
    }

    public Student(int passedID, String passedName){
        super(passedID, passedName);
    }

    public void learn(double numberOfHours) {
        totalStudyTime+=numberOfHours;
    }

    public double getTotalStudyTime(){
        return totalStudyTime;
    }
}
