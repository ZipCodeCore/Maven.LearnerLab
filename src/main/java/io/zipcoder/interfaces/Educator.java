package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    DOLIO(Instructors.getInstance().findById(101L)),
    LEON(Instructors.getInstance().findById(102L)),
    KRIS(Instructors.getInstance().findById(103L));

    Instructor instructor;
    Double timeWorked = 0.0;

    Educator(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        this.instructor.teach(learner, numberOfHours);
        this.timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        this.instructor.lecture(learners, numberOfHours);
        this.timeWorked += numberOfHours;
    }


}
