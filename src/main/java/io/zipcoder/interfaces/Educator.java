package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    ZAN(0,"Zan"), ISANNOYING(1, "is Annoying");

    public double timeWorked;
    public final Instructor instructor;

    Educator(long id, String name) {
        instructor = new Instructor(id, name);
    }

    public void teach(Learner learner, double numberOfHours) {
        this.timeWorked += numberOfHours;
        instructor.teach(learner,numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        this.timeWorked += numberOfHours;
        instructor.lecture(learners,numberOfHours);
    }

    public double getTimeWorked(){
        return timeWorked;
    }
}
