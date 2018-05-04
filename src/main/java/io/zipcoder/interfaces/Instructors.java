package io.zipcoder.interfaces;

import java.util.ArrayList;
import static io.zipcoder.interfaces.Educator.TARIQ;

public final class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        Instructor dirOfEd = new Instructor(1000, "Tariq");
        Instructor bigData = new Instructor( 1001, "Wilhem");
        Instructor enumKing = new Instructor( 1002, "Leon");
        Instructor farmer = new Instructor( 1003, "Froilan");
        Instructor instruct4 = new Instructor( 1004, "Nhu");
        Instructor instruct5 = new Instructor( 1005, "Kris");
        Instructor instruct6 = new Instructor( 1006, "Dolio");
        this.add(dirOfEd);
        this.add(bigData);
        this.add(enumKing);
        this.add(farmer);
        this.add(instruct4);
        this.add(instruct5);
        this.add(instruct6);

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
