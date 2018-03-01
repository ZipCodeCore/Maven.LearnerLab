package io.zipcoder.interfaces;

import java.util.ArrayList;

public class ZipCodeWilmington {

    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();


    //method
    public void hostLecture(Teacher teacher, double numberOfHours){
        Student[] hostLectureStudents = new Student[(students.studentList.size())];
        for (int i = 0; i < students.studentList.size(); i++) {
            hostLectureStudents[i] = ((Student) students.studentList.get(i));
        }
        teacher.lecture(hostLectureStudents, numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        //Instructor
    }
}
