package io.zipcoder.interfaces;

final class Instructors extends People <Instructor>{

    private final static Instructors INSTANCE = new Instructors();


    private Instructors() {

        Instructor Tariq = new Instructor(20);
        Instructor Froilan = new Instructor(21);
        Instructor Wilhem = new Instructor(22);
        Instructor Nhu = new Instructor(23);
        Instructor Leon = new Instructor(24);

        this.add(Tariq);
        this.add(Froilan);
        this.add(Wilhem);
        this.add(Nhu);
        this.add(Leon);


    }

    public static Instructors getINSTANCE() {

        return INSTANCE;
    }

    public Instructor[] getArray() {
        return personList.toArray(new Instructor[personList.size()]);

    }
}
