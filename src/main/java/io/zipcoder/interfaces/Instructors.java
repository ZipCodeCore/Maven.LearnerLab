package io.zipcoder.interfaces;

public final class Instructors extends People <Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {

//        String[] names = {"Dolio", "Leon", "Tariq"};
//
//        for (int i = 0; i < names.length; i++) {
//
//            Instructor instructor = new Instructor();
//            instructor.setName(names[i]);
//            this.add(instructor);
//        }
        for(Educator edu : Educator.values()) {
            this.add(edu.getInstructor());
        }

    }

    public Instructor[] getArray() {
        return personList.toArray(new Instructor[personList.size()]);
    }


    public static Instructors getInstance() {
        return INSTANCE;
    }


}