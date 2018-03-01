package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    TARIQ(99),
    LEON(100),
    FROILAN(101),
    KRIS(102),
    WILHEM(103);

    final Instructor instructor;

    Educator(int id) {
        instructor = new Instructor(id);
    }

    double timeWorked;


    public void teach(Learner learner, double numberOfHours) {
        instructor.timeWorked += numberOfHours;
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        instructor.timeWorked += numberOfHours;
        for (Learner l : learners) {
            l.learn(numberOfHours / learners.length);

        }
    }

    public double getTimeWorked() {
            return timeWorked;
        }
    }


