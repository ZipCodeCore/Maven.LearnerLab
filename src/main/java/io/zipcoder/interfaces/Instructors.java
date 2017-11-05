package io.zipcoder.interfaces;



public final class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors();

     Instructors(){ }

    public Instructor[] getArray() {
        Instructor[] instructor = new Instructor[personList.size()];

        for(int i =0; i< instructor.length; i++){
            instructor[i] = personList.get(i);
        }

        return instructor;
    }


    public static Instructors getInstance(){
        return INSTANCE;
    }



}
