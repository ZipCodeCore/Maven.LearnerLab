package io.zipcoder.interfaces;

public final class  Instructors extends People<Instructor> {

    private static final Instructors INSTANCE=new Instructors();

    private Instructors(){
        for(int i=21; i<25; i++){
            super.add(new Instructor(i));
        }
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

}
