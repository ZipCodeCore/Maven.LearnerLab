package io.zipcoder.interfaces;

public enum Educator implements Teacher{

    LEON (new Instructor(1L, "Leon")),
    DOLIO (new Instructor(2L, "Dolio")),
    DAN (new Instructor(3L, "Dan")),
    KRIS (new Instructor(4L, "Kris"));

    private final Instructor instructor;
    double timeWorked;

    Educator(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        this.instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        Students students = Students.getInstance();
        this.instructor.lecture(learners, numberOfHours);
        timeWorked += numberOfHours / students.personList.size();
    }

    public double getTimeWorked() {
        return timeWorked;
    }
}
