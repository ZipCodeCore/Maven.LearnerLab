package io.zipcoder.interfaces;

public class ZipCodeWilmington extends People {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    void hostLecture(Teacher teacher, double numberOfHours){
        Student[] studentsList = students.personList.toArray(new Student[students.personList.size()]);
        teacher.lecture(studentsList, numberOfHours);
    }

    void hostLecture(long id, double numberOfHours){
        Instructor instructor = (Instructor) instructors.findById(id);
        hostLecture(instructor, numberOfHours);
    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

}
