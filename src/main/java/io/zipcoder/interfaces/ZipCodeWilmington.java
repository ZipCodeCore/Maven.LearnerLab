package io.zipcoder.interfaces;

public final class ZipCodeWilmington{

    Students students;
    Instructors instructors;

    public ZipCodeWilmington(Students students, Instructors instructors) {
        this.students = students;
        this.instructors = instructors;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        new Instructor().lecture(new Students[]{students}, numberOfHours);

    }
    public void hostOfLecture(long id, double numberOfHours){
        hostLecture(instructors, numberOfHours);
    }

}
