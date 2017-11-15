package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Random;

public final class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    private String[] instructorNames = {
            "Tariq Hook",
            "Leon Hunter",
            "Iyasu Watts",
            "Dolio Durant"
    };

    public long generateId() {
        Random r = new Random();
        long id = (long) r.nextInt(100);
        return id;
    }

    private Instructors() {
        super();
        for (String name : instructorNames) {
            long id = generateId();
            add(new Instructor(id, name));
        }

    }

//    public Instructor[] getInstructorsArray(){
//        return super.getArray().toArray((new Instructors[getCount()]);
//    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

    @Override
    public ArrayList<Instructor> getArray() {
        return this.personList;
    }
}
