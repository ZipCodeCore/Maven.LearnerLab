package io.zipcoder.interfaces;

public final class Instructors extends People{

    private static Instructors INSTANCE;

    private Instructors(){
        Student Tariq = new Student(151);
        Student Wilhem = new Student(251);
        Student Steve = new Student(351);
        Student Froilan = new Student(451);
        Student Nhu = new Student(551);
        Student Leon = new Student(651);

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
