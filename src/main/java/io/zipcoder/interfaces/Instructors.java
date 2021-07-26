package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {

    public static final Instructors INSTANCE = new Instructors();

    private Instructors(){

        Instructor leon = new Instructor(12, "lEON");
        Instructor dolio = new Instructor(13, "dolio");
        Instructor kris = new Instructor(14, "kris");

        add(leon);
        add(dolio);
        add(kris);
    }

    @Override
    public Instructor[] toArray() {

        Instructor[] instructorArray = new Instructor[personList.size()];
        personList.toArray(instructorArray);
        return instructorArray;


    }


    public static Instructors getInstance(){
        return INSTANCE;
    }

}
