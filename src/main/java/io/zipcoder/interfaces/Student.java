package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

    double totalStudyTime;

    public void learn(double numberOfHours) {
        for (int i = 0; i < numberOfHours; i++) {
            totalStudyTime++;
        }
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
