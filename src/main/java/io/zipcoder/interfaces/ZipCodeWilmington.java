package io.zipcoder.interfaces;


public class ZipCodeWilmington {
    private  Students students= Students.getInstance();
    private Instructors instructors=Instructors.getInstance();
    public Student student;

    private static ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;
    }

    private ZipCodeWilmington() {
    }

    public void hostLecture(Teacher teacher,double numberOfHours){
        teacher.lecture(students.getArray(),numberOfHours);
    }
    public void hostLecture(long id,double numberOfHours){
        Instructor teacher = instructors.findById(id);
        teacher.lecture(students.getArray(),numberOfHours);
    }



}
