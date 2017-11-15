package io.zipcoder.interfaces;

public enum Educator implements Teacher{
    TARIQ ("Tariq Hook"),
    LEON ("Leon Hunter"),
    DOLIO ("L. Dolio Durant");

    private final Instructor instructor;
    private final Instructors instructors = Instructors.getInstance();
    private double timeWorked = 0;
    private String fullname;

    Educator(String name) {
        this.instructor = new Instructor(instructors.assignNextId(), name);
        instructors.add(instructor);
        fullname = name;
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

    public String getFullname() {
        return fullname;
    }
}
