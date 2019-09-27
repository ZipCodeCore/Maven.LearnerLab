package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {
    public Instructor(Long id) {
        super(id);
    }

    //Defining the methods for teacher to implement from
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for(Learner element : learners ) {
            teach(element,numberOfHoursPerLearner);
//        double numberOfHoursPerLearner = numberOfHours / learner.length;
//        for (int i = 0; i < learner.length; i++) {
//            learner[i].learn(numberOfHoursPerLearner);
        }
    }
}


//Create a `testTeach` method that ensures when an `Instructor` invokes the `teach` method
//a respective student's `totalStudyTime` instance variable is incremented by the specified `numberOfHours`.