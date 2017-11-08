package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    double totalStudyTime;

    public Student(long id) {
        super(id, "Oleg");
    }

    public Student() {
        super();
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime(){
        return totalStudyTime;
    }

}