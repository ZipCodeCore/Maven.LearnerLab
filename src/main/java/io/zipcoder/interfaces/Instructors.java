package io.zipcoder.interfaces;

public class Instructors extends People<Instructor>{



    static final Instructors INSTANCE= new Instructors();

    public Instructors(){
    this.add(new Instructor(1l,"Leon Hunter"));
    this.add(new Instructor(2l,"Dolio Durant"));
    this.add(new Instructor(3l,"Kris Younger"));
    }

    public static Instructors getINSTANCE() {
        return INSTANCE;
    }
}
