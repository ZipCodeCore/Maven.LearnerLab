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
        if(instance == null){
            instance = new Instructors();
        }
        return instance;
    }
}
