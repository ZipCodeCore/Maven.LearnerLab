package io.zipcoder.interfaces;



public class Student extends Person implements Learner {

    public double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime(){

        return totalStudyTime;
    }

}
