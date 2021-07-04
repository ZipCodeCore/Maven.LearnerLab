package io.zipcoder.interfaces;


public final class ZipCodeWilmington extends People {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private static Students students = Students.getInstance();
    private static Instructors instructors = Instructors.getInstance();


    private ZipCodeWilmington() {
    }

    public Person[] getArray() {
        return null;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(students.getArray(), numberOfHours);
    }

   public void hostLecture(long id, double numberOfHours){
       Instructor instructor = instructors.findById(id);
       instructor.lecture(students.getArray(), numberOfHours);
    }

    public static ZipCodeWilmington getInstance(){
        return INSTANCE;
    }

}
