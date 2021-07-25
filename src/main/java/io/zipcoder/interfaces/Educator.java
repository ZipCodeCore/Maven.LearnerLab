package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    LEON(1), DOLIO(2), KRIS(3);

    private final Instructor instructor;
    double timeWorked;

    private Educator(long id) {
        this.instructor = Instructors.getInstance().findById(id);
        Instructors.getInstance().add(instructor);
    }

    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }
}
