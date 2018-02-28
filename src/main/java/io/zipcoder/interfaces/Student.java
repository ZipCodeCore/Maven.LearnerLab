package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private double totalStudyTime;

    public Student(long id) {
        super(id);
    }

    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public double learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
        return totalStudyTime;
    }

    public double getTotalStudyTime(){
        return totalStudyTime;
    }
}
