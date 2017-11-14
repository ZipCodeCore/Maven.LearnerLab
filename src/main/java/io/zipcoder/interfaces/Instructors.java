package io.zipcoder.interfaces;

public class Instructors extends People<Instructor>{

    private static Instructors INSTANCE = null;

    private String[] instructorNames = new String[]{
            "Tariq 'Too Many Cooks' Hook",
            "Leon 'Wagwan' Hunter",
            "Yas",
            "L. Dolio Durant",
            "Melanie"
    };

    private Instructors(){

    }

    public static Instructors getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new Instructors();
            return INSTANCE;
        } else {
            return INSTANCE;}
    }

    @Override
    public Instructor[] getArray() {
        return INSTANCE.personList.toArray(new Instructor[INSTANCE.getCount()]);
    }

    @Override
    public void reset() {
        INSTANCE = new Instructors();
    }
}
