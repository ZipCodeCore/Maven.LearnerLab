package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    private double totalStudyTime = 0;

    public Instructor(long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {

        learner.learn(numberOfHours);
    }

    public void lecture(Learner learners[], double numberOfHours) {

        learners[30].learn(numberOfHours);
        double numberOfHoursPerLearner = numberOfHours / learners.length;


    }

}
