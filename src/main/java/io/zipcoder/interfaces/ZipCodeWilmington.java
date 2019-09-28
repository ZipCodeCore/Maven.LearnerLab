package io.zipcoder.interfaces;

public final class ZipCodeWilmington extends People {

    private  static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    Students students = Students.getInstance();
    Instructors instructors = Instructors.getInstance();

    public ZipCodeWilmington() {
    }

    public static ZipCodeWilmington getInstance() {
        return INSTANCE;

    }
//find the teacher id and add the number of hours to each student
    public  void hostLecture(Teacher teacher, double numberOfHours){

        teacher.lecture(students.getArray(), numberOfHours);
    }


    public  void hostLecture (long id, double numberOfHours){

        Instructor currentInstructor = (Instructor) instructors.findById(id);
        hostLecture(currentInstructor, numberOfHours);


//        currentInstructor.lecture(students.getStudentArray(), numberOfHours);
    }

    public void hostLecture (Educator educator, double numberOfHours){
        educator.lecture(students.getArray(), numberOfHours);
    }
    @Override
    public Person[] getArray() {
        return new Person[0];
    }
}
