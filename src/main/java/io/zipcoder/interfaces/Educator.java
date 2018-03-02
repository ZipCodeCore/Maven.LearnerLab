package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    TARIQ(1100),
    WILHELM(1101),
    LEON(1102),
    FROILAN(1103),
    NHU(1104),
    KRIS(1105),
    DOLIO(1106);

    protected final Instructor instructor;
    private double timeWorked;

    Educator(long id) {
        this.instructor = new Instructor(id);
        Instructors.getInstance().add(this.instructor);
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
