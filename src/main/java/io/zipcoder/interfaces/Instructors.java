package io.zipcoder.interfaces;

public class Instructors extends People <Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        Instructor tariq = new Instructor(9871);
        Instructor leon = new Instructor(12345);
        Instructor kris = new Instructor(87654);
        //Instructor

        personList.add(tariq);
        personList.add(leon);
        personList.add(kris);
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }
    @Override
    public Instructor[] getArray() {
        return personList.toArray(new Instructor[]{});
    }
}
