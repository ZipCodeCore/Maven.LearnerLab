package io.zipcoder.interfaces;

public class ZipCodeWilmington {

    Instructors instructors = Instructors.getInstance();
    Students students = Students.getInstance();

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    private ZipCodeWilmington(){ }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        (instructors.findById(id)).lecture(students.getArray(), numberOfHours);
    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }
}
