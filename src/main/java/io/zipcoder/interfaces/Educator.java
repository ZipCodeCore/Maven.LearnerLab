package io.zipcoder.interfaces;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public enum Educator implements Teacher {
    KRIS(0),
    TARIQ(1),
    LEON(2);

    private final Instructor instructor;
    private double timeWorked;

    //constructor

    Educator(long id) {

        this.instructor = new Instructor(id);
    }


    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double totalStudyTimePerLearner = (numberOfHours / learners.length);
        for (Learner learner : learners) {
            learner.learn(totalStudyTimePerLearner);
        }
        timeWorked += numberOfHours;
    }

    public double getTimeWorked() {
        return timeWorked;
    }
}
