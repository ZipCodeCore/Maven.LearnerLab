package io.zipcoder.interfaces;

public class Instructors extends People{
    private static final Instructors INSTANCE = new Instructors();


    public String [] names =
            {"Tariq Hook", "L. Dolio Durant", "Leon Hunter", "Iyasu Watts", "Frolian Miranda"};

    private Instructors()
    {
        for(int i = 0; i< names.length ; i++){
            Person person = new Instructor(names[i], i+1);
            personList.add(person);
        }
    }


    public static Instructors getInstance()
    {
        return INSTANCE;
    }


}
