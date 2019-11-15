package io.zipcoder.interfaces;

public enum Educator implements Teacher {


    KRIS(546L, "Kris"), CHRIS(547L, "Chris"), DOLIO (548L, "Dolio"),  ROBERTO (549L, "Roberto"), FROILAN (550L, "Froilan");
    Long id;
    String name;


    Educator(Long id, String name){
        this.id = id;
        this.name = name;
    }

    private Double timeTaught;

    @Override
    public void teach(Learner learner, Double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Double numberOfHours, Learner[] learners) {
        Double numberOfHoursPerLearner = numberOfHours / learners.length;
        for( Learner student : learners) {
            student.learn(numberOfHoursPerLearner);
        }
    }
}
