package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    TARIQ(0,"Tariq"), LEON(1, "Leon"), DOLIO(2, "Dolio");

    public double timeWorked;
    public final Instructor instructor;

    Educator(long id, String name) {
        instructor = new Instructor(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {
        this.timeWorked += numberOfHours;
        instructor.teach(learner, numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        this.timeWorked += numberOfHours;
        instructor.lecture(learners, numberOfHours);
    }
    public double getTimeWorked(){
        return timeWorked;
    }
}
