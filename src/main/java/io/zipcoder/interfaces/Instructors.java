package io.zipcoder.interfaces;

public final class Instructors extends People {
    private static final Instructors INSTANCE2 = new Instructors();

    private Instructors(){
        Instructor tariq = new Instructor(5);
        Instructor wilhem = new Instructor(6);
        Instructor leon = new Instructor(7);
        Instructor dolio = new Instructor(8);
        Instructor nhu = new Instructor(9);
        Instructor froilan = new Instructor(10);
        Instructor kris = new Instructor(11);

        super.add(tariq);
        super.add(wilhem);
        super.add(leon);
        super.add(dolio);
        super.add(nhu);
        super.add(froilan);
        super.add(kris);

    }

    public void test() {}

    public static Instructors getInstance(){
        return INSTANCE2;
    }

}
