package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    INSTRUCTOR0(Long.valueOf(1), "instructor0"), INSTRUCTOR1(Long.valueOf(2), "instructor1"), INSTRUCTOR2(Long.valueOf(3), "instructor2"), INSTRUCTOR3(Long.valueOf(4), "instructor3"), INSTRUCTOR4(Long.valueOf(5), "instructor4");

    private Instructor instructor;
    private Double timeWorked = 0.0;

    Educator (Long id, String name) {
        this.instructor = new Instructor(id, name);
    }

    public void teach(Learner learner, Double numberOfHours) {
        timeWorked += numberOfHours;
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, Double numberOfHours) {
        Double numberOfHoursPerLearner = numberOfHours / learners.length;
        for (Learner learner : learners) {
            teach(learner, numberOfHoursPerLearner);
        }
    }

    public Double getTimeWorked() {
        return timeWorked;
    }


}