package io.zipcoder.interfaces;
import java.util.ArrayList;

public final class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    protected Instructors(){

        for (Educator ed : Educator.values()) {
            this.add(new Instructor(ed.getId(), ed.getName()));
        }
//        this.add(new Instructor(1, "Kris"));
//        this.add(new Instructor(9, "Chris"));
//        this.add(new Instructor(10, "Froilan"));
//        this.add(new Instructor(11, "Dolio"));
//        this.add(new Instructor(6, "Roberto"));
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

    public Instructor[] toArray() {
        Instructor[] result = new Instructor[INSTANCE.count()];
        int i = 0;
        for (Instructor instructor: INSTANCE) {
            result[i++] = instructor;
        }
        return result;
    }
}
