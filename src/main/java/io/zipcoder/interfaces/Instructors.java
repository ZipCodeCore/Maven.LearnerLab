package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {

    protected static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        Instructor Tariq = new Instructor(18L, "Tariq");
        Instructor Froilan = new Instructor(19L, "Froilan");
        Instructor Kris = new Instructor(20L, "Kris");
        Instructor Wilhem = new Instructor(21L, "Wilhem");
        Instructor Leon = new Instructor(22L, "Leon");
        Instructor Nhu = new Instructor(23L, "Nhu");
        Instructor Melanie = new Instructor(24L, "Melanie");

        personList.add(Tariq);
        personList.add(Froilan);
        personList.add(Kris);
        personList.add(Wilhem);
        personList.add(Leon);
        personList.add(Nhu);
        personList.add(Melanie);
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }

    public Instructor[] getArray() {
        return personList.toArray(new Instructor[0]);
    }

//    public Instructor findInstructorById(long id) {
//        Instructor instructor = new Instructor();
//        for (Person person : personList) {
//            if (person.getId() == id) {
//                instructor = (Instructor) person;
//            }
//        }
//        return instructor;
//    }

}
