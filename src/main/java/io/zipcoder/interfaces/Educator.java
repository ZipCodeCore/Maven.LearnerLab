package io.zipcoder.interfaces;

import java.util.ArrayList;

public enum Educator implements Teacher {
    TARIQ(1100,"Tariq"),
    WILHELM(1101,"Wilhem"),
    LEON(1102,"Leon"),
    FROILAN(1103,"Froilan"),
    NHU(1104,"Nhu"),
    KRIS(1105,"Kris"),
    DOLIO(1106, "Dolio");

    protected final Instructor instructor;
    protected final String name;
    private double timeWorked;

    Educator(long id,String name) {
        this.name = name;

        this.instructor = new Instructor(id, name);
    }


    public void teach(Learner learner, double numberOfHours) {
        this.instructor.teach(learner, numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        timeWorked += numberOfHours;
        this.instructor.lecture(learners, numberOfHours);
    }



    public void setTimeWorked(double timeWorked) {
        this.timeWorked = timeWorked;
    }

    public double getTimeWorked(){
        return timeWorked;
    }

    public void trackTimeWorked(double timeWorked) {

    }
}
