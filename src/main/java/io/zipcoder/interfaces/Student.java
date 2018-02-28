package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private double totalStudytime;


    //had to add this because the class area was saying I didn't create a default constructor in Person and I checked
    //and I did so I had to use super which references a variable which is used to refer immediate parent class object
    public Student(Long id){
        super(id);
    }

    public void learn(double numberOfHours) {
        this.totalStudytime += numberOfHours;
    }

    public Double getTotalStudyTime(){
        return this.totalStudytime;
    }






}


