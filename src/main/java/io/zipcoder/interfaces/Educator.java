package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    Kazuo_Ishiguro(0.0), Michael_Rosbash(0.0), Barry_Barish(0.0);
    double timeWorked;
    Instructor instructor;

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        this.timeWorked += numberOfHours;
    }
    @Override
    public void lecture(Person[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        this.timeWorked += numberOfHours;
    }

    Educator(double timeWorked) {
        this.timeWorked = timeWorked;
    }

    public double getTimeWorked() {
        return timeWorked;
    }

}
