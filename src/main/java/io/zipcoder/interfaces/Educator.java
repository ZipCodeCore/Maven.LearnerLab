package io.zipcoder.interfaces;

import java.util.function.Supplier;

/**
 * filename:
 * project: interfaces-1
 * author: https://github.com/vvmk
 * date: 2/28/18
 */
public enum Educator implements Teacher{
    TARIQ(0),
    KRIS(1),
    LEON(2),
    WILHEM(3),
    NHU(4),
    DOLIO(5),
    FROILAN(6),
    MELANIE(7);

   final Instructor instructor;

    Educator(long id) {
        this.instructor = new Instructor(id);
    }

    public Instructor getInstructor() {
        return instructor;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
    }
}
