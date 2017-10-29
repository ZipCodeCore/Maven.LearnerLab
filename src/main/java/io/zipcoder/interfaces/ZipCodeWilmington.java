package io.zipcoder.interfaces;

public class ZipCodeWilmington{
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours) {

        Student[] studentArray = new Student[students.getCount()];

        for (int i=0; i<studentArray.length; i++) {
            studentArray[i] = (Student) students.findById(i);
        }

        teacher.lecture(studentArray, numberOfHours);

    }

    public void hostLecture(long id, double numberOfHours) {
        Instructor currentInstructor = (Instructor) instructors.findById(id);
        hostLecture(currentInstructor, numberOfHours);
    }
}
