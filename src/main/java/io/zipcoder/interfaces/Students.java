package io.zipcoder.interfaces;

import java.util.ArrayList;

//The class should be an unextendable subclass of the People class.
public final class Students extends People<Student> {

    //The class should statically instantiate a final field named INSTANCE of type Students.
    private static final Students INSTANCE = new Students();

    /**
     * The class should define a private nullary constructor which populates the INSTANCE
     * field with respective Student representations of your colleagues.
     */
    private Students() {
        //super calls the nullary constructor on the parent class allowing me to
        //instantiate my array from People class. People class has an arraylist of Person
        // or anything that inherits or extends Person. Student and Instructor extends person. Therefore,
        //I can add  either to the array.
        super();
        Student aStudent = new Student("katrina", 899);
        this.add(aStudent);
        Student bStudent = new Student("steve", 900);
        this.add(bStudent);
        Student cStudent = new Student("jack", 901);
        this.add(cStudent);
        Student dStudent = new Student("jane", 902);
        this.add(dStudent);

    }

    //The class should define a getInstance method which returns the INSTANCE field.
    public static Students getINSTANCE() {
        return INSTANCE;
    }

    //override getArray method in people class by creating a getArray method with Student.
    @Override
    public Student[] getArray() {
        return personList.toArray(new Student[0]);
    }

}

/**
 * Part 7.1 - Create Students singleton
 * <p>
 * Note: The creation of this class will demonstrate an implementation of singleton design pattern.
 * Create a Students class.
 * The class should be an unextendable subclass of the People class.
 * The class should statically instantiate a final field named INSTANCE of type Students.
 * The class should define a private nullary constructor which populates the INSTANCE
 * field with respective Student representations of your colleagues.
 * Each student should have a relatively unique id field.
 * The class should define a getInstance method which returns the INSTANCE field.
 */
