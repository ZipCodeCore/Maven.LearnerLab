package io.zipcoder.interfaces;


import java.sql.Array;
import java.util.Arrays;

public class ZipCodeWilmington{

    private static final Students students = Students.getINSTANCE();
    private static final Instructors instructors = Instructors.getINSTANCE();

    private ZipCodeWilmington(){}

//    The class should define a method hostLecture which makes use of a Teacher teacher, double numberOfHours parameter
//    to host a lecture to the composite people field in the students reference.

    public void hostLecture(Teacher teacher, double numberOfHours){

        Student[] studentArray = new Student[students.getArray().length];
        for(int i = 0; i<students.getPersonList().size(); i++) {
            studentArray[i] = students.getArray()[i];
        }

        teacher.lecture(studentArray,numberOfHours);
    }

//    The class should define a method hostLecture which makes use of a long id, double numberOfHours parameter to
//    identify a respective Instructor to host a lecture to the composite people field in the cohort reference.

    public void hostLecture(long id, double numberOfHours){

        Instructor instructor = instructors.findById(id);
        Student[] studentArray = new Student[students.getArray().length];
        for(int i = 0; i<students.getPersonList().size(); i++) {
            studentArray[i] = students.getArray()[i];
        }
        instructor.lecture(studentArray, numberOfHours);


    }


   public static ZipCodeWilmington getINSTANCE() {

        ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

        return INSTANCE;
   }

}

