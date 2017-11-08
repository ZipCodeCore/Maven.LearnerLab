package io.zipcoder.interfaces;
//
//Part 4.0 - Create Teacher Interface
//
//        Create a Teacher interface.
//        Teacher should declare a teach method signature:
//
//        Method name: teach
//        Method parameters:
//        Learner learner
//        double numberOfHours
//        Method return-type: void
//        Teacher should declare a lecture method signature:
//
//        Method name: lecture
//        Method parameters:
//        Learner[] learners
//        double numberOfHours
//        Method return-type: void

import java.util.ArrayList;

public interface Teacher {

     void teach(Learner learner, double numberOfHours);
     void lecture(Learner[] learners, double numberOfHours);


}
