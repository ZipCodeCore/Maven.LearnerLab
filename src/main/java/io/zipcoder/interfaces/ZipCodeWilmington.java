package io.zipcoder.interfaces;

public class ZipCodeWilmington extends People<Person> {
    private static ZipCodeWilmington INSTANCE;

    Students students = Students.getINSTANCE();
    Instructors instructors = Instructors.getINSTANCE();

    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.getArray(), numberOfHours);
    }

    public void hostLecture(long id, double numberOfHours){
        Instructor instructor = instructors.findById(id);
        instructor.lecture(students.getArray(), numberOfHours);
    }

    public static ZipCodeWilmington getINSTANCE(){
        if (INSTANCE != null){
            return INSTANCE;
        }
        else {
            INSTANCE = new ZipCodeWilmington();
            return INSTANCE;
        }
    }

    public Person[] getArray() {
        return personList.toArray(new Person[personList.size()]);
    }
}
