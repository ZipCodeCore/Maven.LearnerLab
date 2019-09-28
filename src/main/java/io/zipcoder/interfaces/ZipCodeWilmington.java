package io.zipcoder.interfaces;

public final class ZipCodeWilmington {

    Students students;
    Instructors instructors;

    private static ZipCodeWilmington INSTANCE;

    private ZipCodeWilmington(){
        this.students = Students.getInstance();
        this.instructors = Instructors.getInstance();

    }

    public static ZipCodeWilmington getInstance(){
        if (INSTANCE == null){
            INSTANCE = new ZipCodeWilmington();
        }
        return INSTANCE;
    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Instructor currentInstructor = instructors.findById(id);
        hostLecture(currentInstructor, numberOfHours);
    }

    public void hostLecture(Educator educator, double numberOfHours){
        educator.lecture(students.getArray(), numberOfHours);
    }

    public int getCount(){
        return this.students.getCount() + this.instructors.getCount();
    }

}
