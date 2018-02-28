package io.zipcoder.interfaces;

public final class Instructors extends People {

    private static Instructors instructorsSingleton;

    private Instructors(){
        Instructor tariq = new Instructor(100);
        Instructor leon = new Instructor(150);
        Instructor froilan = new Instructor(200);
        this.add(tariq);
        this.add(leon);
        this.add(froilan);

    }

    public static Instructors getInstance(){
        if(instructorsSingleton == null){
            instructorsSingleton = new Instructors();
        }
        return instructorsSingleton;
    }

}
