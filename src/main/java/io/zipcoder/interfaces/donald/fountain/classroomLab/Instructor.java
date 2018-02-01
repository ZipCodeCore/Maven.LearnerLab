package io.zipcoder.interfaces.donald.fountain.classroomLab;

public class Instructor extends Person implements Teacher {
    public Instructor(long userId) {
        super(userId);
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        numberOfHours = numberOfHours/learners.length;
        for(Learner person: learners){
            person.learn(numberOfHours);
        }

    }
}
