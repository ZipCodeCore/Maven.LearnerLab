package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    DOLIO (new Instructor(1l,"Dolio")),
    LEON (new Instructor(2l,"Leon")),
    KRIS (new Instructor(3l,"Kris"));

    private final Instructor instructor;
    private double timeWorked;

    Educator(Instructor instructor) {
        this.instructor=instructor;
    }

    public void teach(Learner learner, double numberOfHours) {
        this.instructor.teach(learner,numberOfHours);
        timeWorked+=numberOfHours;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        Students students=Students.getInstance();
        this.instructor.lecture(learners,numberOfHours);
        timeWorked+=numberOfHours/students.personList.size();
    }

    public double getTimeWorked() {
        return timeWorked;
    }
}
