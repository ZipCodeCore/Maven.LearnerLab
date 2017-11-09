package io.zipcoder.interfaces;

public class Instructors extends People{

    private static final Instructors INSTANCE = new Instructors();

    String[] nameOfInstructors = {"Tarik", "Dolio", "Leon", "Iyasu" };

    private Instructors() {
        for(int i =0; i<nameOfInstructors.length; i++){
            Person person = new Instructor(i+1,""+nameOfInstructors);
            personList.add(person);
        }
    }


    public static Instructors getInstance() {
        return INSTANCE;
    }
}
