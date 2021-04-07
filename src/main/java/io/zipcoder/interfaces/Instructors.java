package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE = new Instructors();

    public Instructors() {
        super();
        super.add(new Instructor(1, "Froilan"));
        super.add(new Instructor(2, "Dolio"));
        super.add(new Instructor(3, "Roberto"));
    }

    public Instructor[] toArray() {
        return personList.toArray(new Instructor[0]);
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

}
