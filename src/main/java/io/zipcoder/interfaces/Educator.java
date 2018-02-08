package io.zipcoder.interfaces;


public enum Educator implements Teacher {
    Tariq (123, "Hook"),
    Dolio (124, "Dolio"),
    Leon (125, "Leon"),
    Iyasu(126, "Iyasu"),
    ;

    public double timeWorked;
    public final Instructor instructor;


      Educator(long id, String name) {
        instructor = new Instructor(id, name);

    }

    public double getTimeWorked() {
        return timeWorked;
    }

    public void teach(Learner learner, double numberOfHours) {
        this.timeWorked += numberOfHours;
         instructor.teach(learner, numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        this.timeWorked += numberOfHours;
        instructor.lecture(learners, numberOfHours);
    }

}
