package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor>{
    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
//        Instructor Leon = new Instructor(1);
//        Instructor Wilhem = new Instructor(2);
//        Instructor Tariq = new Instructor(3);
//        Instructor Nhu = new Instructor(4);
//        personList.add(Leon);
//        personList.add(Wilhem);
//        personList.add(Tariq);
//        personList.add(Nhu);


    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

    public Instructor[] getArray() {
        return personList.stream().toArray(Instructor[]::new);
    }

    public void createEducators(){
        for (Educator educator: Educator.values()) {
            educator.getTimeWorked();
        }
    }
}
