package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    DOLIO( new Instructor(1l, "Dolio")),
    LEON(new Instructor(2l, "Leon")),
    OTHERDOLIO(new Instructor(3l, "OtherDolio"));


    final Instructor instructor;
    double timeWorked;

    Educator(Instructor instructor) {
        this.instructor = instructor;
        Instructors.getInstance().add(instructor);
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
