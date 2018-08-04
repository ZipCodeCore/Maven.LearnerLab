package io.zipcoder.interfaces;

public final class Instructors extends People {
    private static Instructors instance = null;

    private Instructors() {
        super();
        long id = 0;
        for (InstructorNames name : InstructorNames.values()) {
            id++;
            Instructor s = new Instructor(id);
            s.setName(name.toString());
            personList.add(s);

        }
    }

    public static Instructors getInstance() {
        if (instance == null) {
            instance = new Instructors();
        }
        return instance;
    }

    public Instructor[] getInstructorsAsArray() {

        Person[] person = Instructors.getInstance().getPersonAsArray();
        Instructor[] instructor = new Instructor[person.length];
        for (int i = 0; i < person.length; i++) {
            instructor[i] = (Instructor) person[i];
        }
        return instructor;

    }
}
