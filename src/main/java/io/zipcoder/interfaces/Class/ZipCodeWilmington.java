package io.zipcoder.interfaces.Class;
import io.zipcoder.interfaces.Interface.Teacher;


public class ZipCodeWilmington {
    private Students students = Students.getINSTANCE();
    private Instructors instructors = Instructors.getInstructors();

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.getArray(),numberOfHours);
    }

    public void hostLecture(long ID , double numberOfHours){
        instructors.findById(ID).lecture(students.getArray(),numberOfHours);
    }
}
