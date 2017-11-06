package io.zipcoder.interfaces;

//Part 7.1 - Create Students singleton
//
//        Note: The creation of this class will demonstrate an implementation of singleton design pattern.
//        Create a Students class.
//        The class should be an unextendable subclass of the People class.
//        The class should statically instantiate a final field named INSTANCE of type Students.
//        The class should define a private nullary constructor which populates the INSTANCE field with respective
//        io.zipcoder.interfaces.Student representations of your colleagues.
//        Each student should have a relatively unique id field.
//        The class should define a getInstance method which returns the INSTANCE field.


import java.sql.Array;
import java.util.ArrayList;

public class Students extends People<Student>{

    private static final Students INSTANCE;

    private Students(){
    }

    static {
        INSTANCE = new Students();
    }

    public static Students getINSTANCE() {
        return INSTANCE;
    }

    public Student[] getArray(){

        int personListSize = getPersonList().size();
        Student[] students = new Student[personListSize];

        for(int i=0; i<personListSize; i++) {
            students[i] = getPersonList().get(i);
        }
        return students;

    }

}
