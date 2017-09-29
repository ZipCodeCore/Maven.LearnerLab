package io.zipcoder.interfaces;


public class Instructor extends Person implements Teacher{

    Instructor(String name) {
        super(name);
    }

    public void teach(Student student, double numberOfHours) {
        student.learn(numberOfHours);

        System.out.print(student.getTotalStudyTime());
    }

    public void lecture(Student[] student, double numberOfHours) {

        double numberOfHoursPerStudent = numberOfHours / student.length;
        System.out.println(numberOfHoursPerStudent);
    }


}
