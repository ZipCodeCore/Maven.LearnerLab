package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        this.add(new Instructor(1L, "Leon"));
        this.add(new Instructor(2L, "Dolio"));
        this.add(new Instructor(3L, "Dan"));
        this.add(new Instructor(4L, "Liz"));
    }

    public static Instructors getInstance() { return INSTANCE; }

    @Override
    public Instructor[] getArray() {
        return super.personList.toArray(new Instructor[0]);
    }
}
