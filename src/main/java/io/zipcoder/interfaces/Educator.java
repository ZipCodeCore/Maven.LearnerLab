package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    KRIS(new Instructor(35, "Kris"),0),
    ROBERTO(new Instructor(36, "Roberto"),0),
    CHRIS(new Instructor(37, "Chris"),0);

    private final Instructor instructor;
    double timeWorked;

    Educator(Instructor instructor, double timeWorked){
        this.instructor = instructor;
        this.timeWorked = timeWorked;
        Instructors instructors = Instructors.getInstance();
        instructors.addPerson(instructor);
    }

    public void teach(Learner learner, double numberOfHours) {
        this.instructor.teach(learner,numberOfHours);
        timeWorked += numberOfHours;
    }

    public void lecture(Learner[]learners, double numberOfHours) {
        this.instructor.lecture(learners,numberOfHours);
        timeWorked += numberOfHours;
    }

    public double getTimeWorked() {
        return timeWorked;
    }
}
