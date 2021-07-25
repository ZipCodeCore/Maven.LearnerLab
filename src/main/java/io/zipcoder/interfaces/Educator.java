package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    LEON (new Instructor(0, "Leon")),
    DOLIO(new Instructor(1,"Dolio")),
    KRIS(new Instructor(2,"Kris"));

    private final Instructor instructor;
    private Double timeWorked;

    Educator(Instructor instructor) {
        this.instructor = instructor;
        Instructors.getInstance().add(instructor);
    }

    @Override
    public void teach(Learner learner, Double numberOfHours) {
        instructor.teach(learner,numberOfHours);
        setTimeWorked(numberOfHours);
    }

    @Override
    public void lecture(Learner[] learners, Double numberOfHours) {
        instructor.lecture(learners,numberOfHours);
        setTimeWorked(numberOfHours);
    }

    public void setTimeWorked(Double timeWorked) {
        this.timeWorked = timeWorked;
    }

    public Double getTimeWorked() {
        return timeWorked;
    }
}
