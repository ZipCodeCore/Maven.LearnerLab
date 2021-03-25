package io.zipcoder.interfaces;


public final class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE;// = new Instructors();


    public static Instructors getInstance(){
        return INSTANCE;
    }

    public Instructor[] toArray() {
        Instructor[] instructorsArray = new Instructor[this.INSTANCE.count()];
        int i = 0;
        for (Instructor eachInstructor : this.INSTANCE){
            instructorsArray[i++] = eachInstructor;
        }
        return instructorsArray;
    }

    // the below is how you instantiate it
    static {
        INSTANCE = new Instructors();
        INSTANCE.add(new Instructor(30L,"Dolio"));
        INSTANCE.add(new Instructor(31L,"Roberto"));
    }
}
