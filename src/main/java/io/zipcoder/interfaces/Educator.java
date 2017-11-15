package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    LEON(0.00, 0), TARIQ(0.00, 0), DOLIO(0.00, 0);


    private Instructor instructor;
    private double timeWorked;
    private int numbersOfHours;


    public void teach(Learner learner, double numberOfHours) {

        this.timeWorked += numberOfHours;
        instructor.teach(learner, numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {

        this.timeWorked += numberOfHours;
        instructor.lecture(learners, numberOfHours);
    }


    Educator(double timeWorked, int numbersOfHours) {
        this.timeWorked = timeWorked;
        this.numbersOfHours = numbersOfHours;
        instructor = new Instructor(1, "Dolio");

    }

    public double getTimeWorked() {
        return timeWorked;
    }

}


