package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {

    private static Instructors INSTANCE;

    private Instructors() {
       Instructor bob = new Instructor(1);
        Instructor tom = new Instructor(2);
        Instructor ted = new Instructor(3);
        Instructor fred = new Instructor(4);

        this.addPerson(bob);
        this.addPerson(tom);
        this.addPerson(ted);
        this.addPerson(fred);

    }


    public static Instructors getInstance() {
        if (INSTANCE == null){
            INSTANCE = new Instructors();
        }
        return INSTANCE;
    }

    public Instructor[] getArray() {
        Instructor[] array = new Instructor[personList.size()];
        for (int i = 0; i < personList.size(); i++) {
            array[i] = personList.get(i);
        }
        return array;
    }


}
