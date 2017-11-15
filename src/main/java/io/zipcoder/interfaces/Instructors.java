package io.zipcoder.interfaces;


import java.util.ArrayList;

public final class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors();

   private String[] instructorName = {"Tariq", "Leon", "Dolio"};

     Instructors(){
         for (int i = 0; i <3; i++) {
             Instructor instructor = new Instructor(i, instructorName[i]);
             add(instructor);

         }



     }

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

    @Override

    public String toString (){
        String studentName = "";

        for (Instructor instructor: personList)

            studentName +=  instructor.toString() + "," ;

        return  studentName;

    }



}
