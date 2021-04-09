package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {

    private static Instructors INSTANCE;

    private Instructors() {

        Instructor Tariq = new Instructor(201);
        Instructor Leon = new Instructor(202);
        Instructor Kris = new Instructor(203);
        Instructor Dolio = new Instructor(204);

        this.add(Tariq);
        this.add(Leon);
        this.add(Kris);
        this.add(Dolio);
    }

    public static Instructors getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new Instructors();
        }
        return INSTANCE;
    }

    public Instructor[] getArray() {
        Instructor[] Array = new Instructor[personList.size()];
        for (int i = 0; i < personList.size(); i++) {
            Array[i] = personList.get(i);
        }
        return Array;
    }
}
