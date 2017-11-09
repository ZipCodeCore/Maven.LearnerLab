package io.zipcoder.interfaces;

public final class ZipCodeWilmington{

    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();

    public void hostLecture(Teacher teacher, double numberOfHours) {

        teacher.lecture((Learner[])students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){

        Instructor instructor = (Instructor)instructors.findById(id);
        instructor.lecture((Learner[])students.getArray(), numberOfHours);

    }
}
