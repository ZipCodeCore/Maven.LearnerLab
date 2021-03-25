package io.zipcoder.interfaces;

public final class ZipCodeWilmington extends People<Person>{

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    private static final Students students = Students.getInstance();
    private static final Instructors instructors = Instructors.getInstance();

    private ZipCodeWilmington(){

    }

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.toArray(),numberOfHours);
    }

    public void hostLecture(Long id, double numberOfHours){
        Instructor instructor = instructors.findById(id);
        instructor.lecture(students.toArray(),numberOfHours);
    }

    public static ZipCodeWilmington getInstance(){
        if(INSTANCE != null){
            return INSTANCE;
        }
        else{
            return INSTANCE;
        }
    }

    public Person[] toArray() {
        return new Person[0];
    }
}
