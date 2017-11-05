package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    private double totalStudyTime = 0;

    public Instructor(long id, String name) {
        super(id, name);
    }

    public double teach(Learner learner, double numberOfHours) {

        return totalStudyTime += numberOfHours;

    }

    public double lecture(Learner learners[], double numberOfHours) {

        double numberOfHoursPerLearner = numberOfHours / learners.length;
        return numberOfHoursPerLearner;


    }

}
