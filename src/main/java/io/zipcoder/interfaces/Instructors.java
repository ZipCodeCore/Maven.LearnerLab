package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE = new Instructors();
    private Instructor[] instructorArray;

    private Instructors(){
        Instructor nhu = new Instructor(20);
        Instructor leon = new Instructor(21);
        Instructor kris = new Instructor(22);
        Instructor tariq = new Instructor(23);

        instructorArray = new Instructor[]{nhu, leon, kris, tariq};

    }

    @Override
    public Instructor[] getArray() {
        Instructor[] instructor =  personList.toArray(new Instructor[0]);
        return instructor;
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

    public Instructor[] getInstructorArray () {
        return this.instructorArray;
    }

}
