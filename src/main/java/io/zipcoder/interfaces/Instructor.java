package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher{

    private String name;

    public Instructor(long id) {
        super(id);
        this.name = name;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for(int i = 0; i<learners.length; i++) {
            learners[i].learn(numberOfHoursPerLearner);
        }
    }
}
