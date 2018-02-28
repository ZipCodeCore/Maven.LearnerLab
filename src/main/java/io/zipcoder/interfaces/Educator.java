package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    TARIQ(1),
    FROILAN(2),
    LEON(3),
    WILHEM(4);

    private final Instructor instructor;

    double timeWorked = 0;

    Educator (long id) {
        this.instructor = new Instructor(id);
        Instructors instructors = Instructors.getInstance();
        instructors.add(this.instructor);
    }

    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        this.timeWorked += numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        this.timeWorked += numberOfHours;
    }

}
