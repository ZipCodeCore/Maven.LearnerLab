package io.zipcoder.interfaces.donald.fountain.classroomLab;

import java.util.stream.Stream;

public enum Educator implements Teacher {
    Dolio("Dolio", 007),
    Zach("Zach", 1),
    Tariq("Tariq", 2),
    Iyasu("Iyasu", 3),
    Janelle("Janelle", 4),
    Melanie("Melanie", 5),
    Samantha("Samantha", 6),
    Makalia("Makalia", 8),
    Froilan("Friolan", 9),
    Leon("Leon", 10)
    ;

    public final Instructor instructor;

    public double getTimeWorked() {
        return timeWorked;
    }

    public double timeWorked;


    Educator(String name, long iDNumber) {
        instructor = new Instructor(iDNumber);
        instructor.setName(name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.lecture(learners, numberOfHours);
        timeWorked += numberOfHours;
    }
}
