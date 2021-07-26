package io.zipcoder.interfaces;

public class Instructors extends People<Instructor>{
    private static final Instructors instance=new Instructors();

    private Instructors(){
        this.add(new Instructor(1l,"Dolio"));
        this.add(new Instructor(2l,"Leon"));
        this.add(new Instructor(3l,"Kris"));
    }

    public static Instructors getInstance(){return instance;}

    public Instructor[] getArray() {
        return super.personList.toArray(new Instructor[0]);
    }
}
