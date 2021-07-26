package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    LEON(12, "leon"),
    DOLIO(13, "dolio"),
    KRIS(14, "kris");

    double timeWorked;
    private final Instructor instroctor;

    private Educator(long id, String name) {
        this.instroctor = new Instructor(id, name);
        Instructors.getInstance().add(this.instroctor); /// ????????
    }



    @Override
    public void teach(Learner learner, double numberOfHours) {
    instroctor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
    instroctor.lecture(learners, numberOfHours);
    timeWorked += numberOfHours;
    }
}
