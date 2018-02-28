package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {
    public Instructor(long id) {
        super(id);
    }


    public void teach(Student learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Student[] learners, double numberOfHours) {
        for (Student s : learners) {

            s.learn(numberOfHours / learners.length);
        }
    }
}
