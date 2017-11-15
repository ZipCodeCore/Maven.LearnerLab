package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    LEON(0.00, 0), TARIQ(0.00, 0), DOLIO(0.00, 0);


    private Instructor instructor;
    private final Instructors instructors = Instructors.getInstance();
    private double timeWorked;
    private int numbersOfHours;


    public void teach(Learner learner, double numberOfHours) {

        this.getTimeWorked();
        instructor.teach(learner, numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {

        this.getTimeWorked();
        instructor.lecture(learners, numberOfHours);
    }

    Educator(double timeWorked, int numbersOfHours) {
        this.timeWorked = timeWorked;
        this.numbersOfHours = numbersOfHours;

    }

    public double getTimeWorked() {
        return timeWorked;
    }

    public void timeWorked() {
        //Could not get this method to work, therefore could not test in TestEducator. Otherwise....
        //everything should be complete.
    }

}

