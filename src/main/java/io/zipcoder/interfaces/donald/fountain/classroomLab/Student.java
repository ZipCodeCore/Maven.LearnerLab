package io.zipcoder.interfaces.donald.fountain.classroomLab;

public class Student extends Person implements Learner {

    private double totalStudyTime;

    public Student(long userId) {
        super(userId);
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

}
