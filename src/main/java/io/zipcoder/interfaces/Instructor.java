package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{

    public Instructor(Long id, String name) {
        super(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberofHoursPerStudent = numberOfHours / learners.length;
        for(Learner learner : learners)
            learner.learn(numberofHoursPerStudent);
    }



}
