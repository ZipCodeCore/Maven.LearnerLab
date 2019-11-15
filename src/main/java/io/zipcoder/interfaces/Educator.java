package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    ONE(new Instructor(2323L, "BIP")), BOOP(new Instructor(3232L, "BOOP"));

    Instructor instructor;
    Double timeWorked = 0D;

    Educator(Instructor instructor) {
    this.instructor = instructor;
    }

    @Override
    public void teach(Learner learner, Double numberOfHours) {
        this.instructor.teach(learner,numberOfHours);
        this.timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, Double numberOfHours) {
        this.instructor.lecture(learners, numberOfHours);
        this.timeWorked += numberOfHours;
    }
}
