package io.zipcoder.interfaces.Class;

public final class Instructors extends People<Instructor>{
    private final static Instructors INSTANCE  = new Instructors();

    public static Instructors getInstructors(){
        return INSTANCE;
    }

    private Instructors(){
        super();
    }

    public Instructor[] getArray() {
        return super.getPeopleList().toArray(new Instructor[getCount()]);
    }
}
