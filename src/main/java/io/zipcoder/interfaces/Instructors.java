package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor>{
    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        this.add(new Instructor(1l,"Dolio"));
        this.add(new Instructor(2l,"Leon"));
        this.add(new Instructor(3l,"Other Dolio"));
    }


    public static Instructors getInstance(){
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
        return new Instructor[0];
    }
}
