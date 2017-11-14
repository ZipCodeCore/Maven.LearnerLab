package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    Tariq_Hook(0.0),
    Dolio_Durant(0.0),
    Leon_Hunter(0.0),
    Mikaila_Akeredolu(0.0),
    Yassu(0.0);

    Double timeWorked;

    Educator(Double timeWorked) {
        this.timeWorked = timeWorked;
    }

    public void addTimeworked(double timeworked) {
        this.timeWorked += timeworked;
    }

    public Double getTimeWorked() {
        return timeWorked;
    }

    public void teach(Learner learner, double numberOfHours) {
        this.addTimeworked(numberOfHours);

        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        this.addTimeworked(numberOfHours);

        double numberOfHoursPerLearner = numberOfHours/learners.length;
        for (Learner learner: learners) {
            learner.learn(numberOfHoursPerLearner);
        }
    }
}
