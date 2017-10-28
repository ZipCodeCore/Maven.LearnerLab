package io.zipcoder.interfaces;

public class ZipCodeWilmington {

    Instructors instructors = Instructors.getInstance();
    Students students = Students.getInstance();

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private ZipCodeWilmington(){ }

    public static void hostLecture(Teacher teacher, double numberOfHours){
        Person[] people = Students.getArray();
        Student[] students = (Student[])people;

        teacher.lecture(students, numberOfHours);
    }

    public static void hostLecture(long id, double numberOfHours){
        ((Instructor)(Instructors.findById(id))).lecture((Student[])Students.getArray(), numberOfHours);
    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }
}
