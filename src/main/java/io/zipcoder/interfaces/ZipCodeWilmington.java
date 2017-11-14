package io.zipcoder.interfaces;

public class ZipCodeWilmington{
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    public <T extends Teacher> void hostLecture(T teacher, double numberOfHours) {

        Student[] studentArray = new Student[students.getCount()];

        for (int i=0; i<studentArray.length; i++) {
            studentArray[i] = students.findById(i);
        }

        teacher.lecture(studentArray, numberOfHours);

    }

    public <T extends Educator>void hostLecture(long id, double numberOfHours) {
        Instructor currentInstructor = instructors.findById(id);
        hostLecture(currentInstructor, numberOfHours);
    }
}
