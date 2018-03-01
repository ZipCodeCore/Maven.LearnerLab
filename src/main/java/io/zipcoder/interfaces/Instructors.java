package io.zipcoder.interfaces;

public final class Instructors extends People {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        Instructor Tariq = new Instructor("Tariq", 2000);
        Instructor Leon = new Instructor("Leon", 2001);
        Instructor Froilan = new Instructor("Froilan", 2002);
        Instructor Wilhem = new Instructor("Wilhem", 2003);
        Instructor Kris = new Instructor("Kris", 2004);
        Instructor Nhu = new Instructor("Nhu", 2005);
        personList.add(Tariq);
        personList.add(Leon);
        personList.add(Froilan);
        personList.add(Wilhem);
        personList.add(Kris);
        personList.add(Nhu);
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

    public Integer getCount() {
        return personList.size();
    }

}
