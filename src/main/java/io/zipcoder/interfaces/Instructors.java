package io.zipcoder.interfaces;

public final class Instructors extends People <Instructor> {
    private static final Instructors INSTANCE = new Instructors();

    public static Instructors getInstance() {
        return INSTANCE;
    }

    private Instructors() {
        Instructor toughTariq = new Instructor(99);
        Instructor lazyLeon = new Instructor(100);
        Instructor friendlyFroilan = new Instructor(101);
        Instructor killinItKris = new Instructor(102);
        Instructor wittyWilhem = new Instructor(103);

        this.addPerson(toughTariq);
        this.addPerson(lazyLeon);
        this.addPerson(friendlyFroilan);
        this.addPerson(killinItKris);
        this.addPerson(wittyWilhem);

    }

    public Instructor[] getArray() {
        return personList.toArray(new Instructor[personList.size()]);
    }
}
