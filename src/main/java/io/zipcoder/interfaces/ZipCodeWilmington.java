package io.zipcoder.interfaces;

public class ZipCodeWilmington {

    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getInstance();


    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students, numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {

    }

}
