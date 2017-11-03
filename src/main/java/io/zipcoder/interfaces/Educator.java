package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    TARIQ ("Tariq Hook"),
    LEON ("Leon Hunter"),
    DOLIO ("L. Dolio Durant");

    private final Instructor instructor;
    private final Instructors INSTANCE = Instructors.getInstance();
    private double timeWorked = 0;

    Educator(String name) {
        this.instructor = new Instructor(INSTANCE.assignNextId(), name);
        INSTANCE.add(instructor);
    }

    public double getTimeWorked() {
        return timeWorked;
    }

    public void teach(Learner learner, double numberOfHours) {
        timeWorked += numberOfHours;
        instructor.teach(learner, numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        timeWorked += numberOfHours;
        instructor.lecture(learners, numberOfHours);
    }

}
