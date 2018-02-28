package io.zipcoder.interfaces;

public final class Instructors extends People{

    private static Instructors INSTANCE;

    private Instructors(){
        Instructor Tariq = new Instructor(151);
        Instructor Wilhem = new Instructor(251);
        Instructor Steve = new Instructor(351);
        Instructor Froilan = new Instructor(451);
        Instructor Nhu = new Instructor(551);
        Instructor Leon = new Instructor(651);

        this.add(Tariq);
        this.add(Wilhem);
        this.add(Steve);
        this.add(Froilan);
        this.add(Nhu);
        this.add(Leon);
    }

    public static Instructors getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Instructors();
        }
        return INSTANCE;
    }

}
