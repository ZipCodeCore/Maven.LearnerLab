package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    ONE(),TWO();



    @Override
    public void teach(Learner learner, Double numberOfHours) {

    }

    @Override
    public void lecture(Learner[] learner, Double numberOfHours) {

    }
}
