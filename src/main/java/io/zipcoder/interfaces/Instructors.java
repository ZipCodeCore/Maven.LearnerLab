package io.zipcoder.interfaces;

public final class Instructors extends People implements Teacher{
    private static final Instructors instance = new Instructors();

    private Instructors(){
        Instructor i1 = new Instructor(getId(), "Tariq");
        Instructor i2 = new Instructor(getId(), "Kris");
        Instructor i3 = new Instructor(getId(), "Leon");
        Instructor i4 = new Instructor(getId(), "Nhu");
        Instructor i5 = new Instructor(getId(), "Wilhem");
    }

    public static Instructors getInstance() {
        return instance;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {

    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {

    }
}
