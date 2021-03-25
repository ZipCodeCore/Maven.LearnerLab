package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher
{
    public Instructor (String name, long id)
    {
        super(name, id);
    }

    public void teach(Learner learner, double numbOfHours)
    {
        //5.1 calls a parameter of type Learner Interface (its public)
        learner.learn(numbOfHours);

    }


    public void lecture(Learner [] learners, double numberOfHours)
    {
        double numberOfHoursPerLearner = numberOfHours / learners.length;

        for(Learner element : learners)
        {
            teach(element, numberOfHoursPerLearner);
        }

    }
}
