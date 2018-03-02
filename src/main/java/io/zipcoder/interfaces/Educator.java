package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    TARIQ(324324), LEON(3243244), KRYS(34432), FROILAN(756563), WILHEM(3274832);

    private final Instructor instructor;

    double timeWorked;

    Educator(long id) {
        this.instructor = new Instructor(id);
    }


        @Override
        public void teach(Learner learner, double numberOfHours) {
            timeWorked += numberOfHours;
            learner.learn(numberOfHours);

        }
        @Override
        public void lecture(Learner[] learners, double numberOfHours) {
            timeWorked += numberOfHours;
            double numberOfHoursPerLearner = numberOfHours / (double)learners.length;
            for (Learner l:learners){
                l.learn(numberOfHoursPerLearner);

            }
    }

    public double getTimeWorked() {
            return timeWorked;
    }
}


