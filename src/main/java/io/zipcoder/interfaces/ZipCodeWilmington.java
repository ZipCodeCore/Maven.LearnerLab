package io.zipcoder.interfaces;

public final class ZipCodeWilmington {

    private Students students;
    private Instructors instructors;

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
        teacher.lecture(students.getStudentArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Instructor currentInstructor = (Instructor) instructors.findById(id);
        hostLecture(currentInstructor, numberOfHours);
    }

    public int getCount(){
        return this.students.getCount() + this.instructors.getCount();
    }

}
