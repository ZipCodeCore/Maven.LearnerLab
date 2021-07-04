package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Arrays;

import static io.zipcoder.interfaces.Educator.TARIQ;

public final class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        Instructor dirOfEd = Educator.TARIQ.instructor;
        Instructor bigData = Educator.WILHELM.instructor;
        Instructor enumKing = Educator.LEON.instructor;
        Instructor farmer = Educator.FROILAN.instructor;
        Instructor instruct4 = Educator.NHU.instructor;
        Instructor instruct5 = Educator.KRIS.instructor;
        Instructor instruct6 = Educator.DOLIO.instructor;
        Instructor[] instructors = {dirOfEd,bigData,enumKing,farmer,instruct4,instruct5,instruct6};
        this.addAll(instructors);
    }

    @Override
    public Instructor[] getArray(){
        Instructor[] personArray = new Instructor[getPersonList().size()];
        for(int i = 0; i<personArray.length; i++) {
            personArray[i] = getPersonList().get(i);
        }
        return personArray;

    }

    public String instructorArrayToString(Instructor[] array){
        String x = "";
        for(Instructor instructor: array){
            x+= instructor.getName() + " ";
        }
        return x;
    }
    public static Instructors getInstance(){
        return INSTANCE;
    }

}
