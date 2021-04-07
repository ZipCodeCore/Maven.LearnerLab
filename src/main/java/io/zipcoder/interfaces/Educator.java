package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    INSTRUCTOR0(1L, "instructor0"), INSTRUCTOR1(2L, "instructor1"),
    INSTRUCTOR2(3L, "instructor2");

    private Instructor instructor;
    private Double timeWorked = 0.0;

    Educator(Long id, String name) {
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
