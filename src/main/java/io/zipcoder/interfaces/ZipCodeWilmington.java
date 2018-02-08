package io.zipcoder.interfaces;

public final class ZipCodeWilmington extends People<Person> {

    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();
    public static final Students students = Students.getInstance();
    private static final Instructors insturctors = Instructors.getInstance();


    public static ZipCodeWilmington getInstance() {
        if (INSTANCE != null) {
            return INSTANCE;
        } else {
            return INSTANCE;
        }
    }


    public void hostLecture(Teacher teacher, double numberOfHours) {

    teacher.lecture(students.personList.toArray(new Learner[students.personList.size()]), numberOfHours);}

    public void hostLecture(long id, double numberOfHours){
        Instructor instructor =  insturctors.findById(id);
        instructor.lecture(students.personList.toArray(new Learner[students.personList.size()]), numberOfHours);

    }


    public Person[] getArray() {
        return new Person[0];
    }
}

