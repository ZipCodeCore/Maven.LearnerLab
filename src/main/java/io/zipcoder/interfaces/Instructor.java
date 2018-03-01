package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    public Instructor(long id) {
        super(id);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {

        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner l: learners) {
            l.learn(numberOfHoursPerLearner);
        }
    }
}





//
//    public double learn(double numberOfHours) {
//        totalStudyTime += numberOfHours;
//        return numberOfHours;
//    }
