package io.zipcoder.interfaces;

public class Instructors extends People{
    private static final Instructors INSTANCE = new Instructors();
    String[] names = {"Tariq Hook","L. Dolio Durant", "Leon Hunter", "Iyasu Watts"};
    private Instructors(){
        for(int i=0;i<names.length;i++){
            Person person = new Instructor(i+1,names[i]);
            personList.add(person);
        }
    }
    public static Instructors getInstance(){
        return INSTANCE;
    }

}
