package io.zipcoder.interfaces;

public class ZipCodeWilmington {
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();


    public static ZipCodeWilmington getINSTANCE() {
        return INSTANCE;
    }
    private ZipCodeWilmington(){

    }

    private Students students = Students.getInstance();
    private Instructors instructors = Instructors.getINSTRUCTORSINSTANCE();

    Learner[] learners = new Learner[students.personList.size()];

    public void hostLecture(Teacher teacher,double numberOfHours){
        teacher.lecture(students.personList.toArray(new Learner[students.personList.size()]),numberOfHours);
        //teacher.lecture();
    }
    public void hostLecture(long id,double numberOfHours){
         Instructor instructor = instructors.findById(id);
         instructor.lecture(students.personList.toArray(new Learner[students.personList.size()]),numberOfHours);
    }
}
