package io.zipcoder.interfaces;

public enum Educator implements Teacher {

    TARIQ (10),
    LEON(11),
    KRIS(12),
    WILHELM(13),
    FROILAN(14),
    NHU(15);

    private int id;
    double timeWorked;


    Educator(int id) {
        Instructor instructor = new Instructor(id);
        Instructors.getInstance().addPerson(instructor);
        this.id  = id;
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        timeWorked += numberOfHours;
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for(Learner learner: learners) {
            learner.learn(numberOfHoursPerLearner);
        }
        timeWorked += numberOfHours;
    }

    public double getTimeWorked() {
        return timeWorked;
    }

    public int getId() {
        return id;
    }

    public static Educator findById(int id) {
        for (Educator educator : Educator.values()) {
                if (educator.getId() == id) {
                    return educator;
                }
            }
            return null;
    }
}
