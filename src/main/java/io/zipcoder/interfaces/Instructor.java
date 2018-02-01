package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    public Instructor(){super();}

    public Instructor(int passedID, String passedName){
        super(passedID, passedName);
    }

    public void teach(Learner learner, double passedNumberOfHours)
    {
        for (Educator e : Educator.values()){
            if (this.getId()==e.getInstructor().getId()){
                e.teach(learner, passedNumberOfHours);
                break;
            }
        }
    }


    public void lecture(Learner[] learners, double passedNumberOfHours){
        for (Educator e : Educator.values()){
            if (this.getId()==e.getInstructor().getId()){
                e.lecture(learners, passedNumberOfHours);
                break;
            }
        }
    }




}
