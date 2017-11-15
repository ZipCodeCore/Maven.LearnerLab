package io.zipcoder.interfaces.classes;


import io.zipcoder.interfaces.interfaces.Teacher;

public class ZipCodeWilmington {

    private Students students = Students.getINSTANCE();
    private Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours) {
        //lecture takes an Array of Learners(Students) and a number of hours
        //references Students instance and turns it into a array of learners?
        teacher.lecture(students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours) {
        Instructor instructor = instructors.findById(id);
        instructor.lecture(students.getArray(), numberOfHours);

    }

}
