package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    double totalStudyTime;

//    public Student(Long id) {
//        super(id);
//    }


    public Student(String studentsName, Long id) {
        super(studentsName, id);
    }

    public Student(long i) {
        super(i);
    }


    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime(){
        return totalStudyTime;
    }

}