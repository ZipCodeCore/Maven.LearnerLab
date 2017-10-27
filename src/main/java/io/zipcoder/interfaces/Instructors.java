package io.zipcoder.interfaces;

public class Instructors extends People{

    private static final Instructors INSTANCE = new Instructors();

    private String[] instructorNames = new String[]{
            "Tariq 'Too Many Cooks' Hook",
            "Leon 'Wagwan' Hunter",
            "Yas",
            "Mrs Kooman",
            "L. Dolio Durant"
    };

    private Instructors(){
        if (INSTANCE == null) {
            for (int i = 0; i < instructorNames.length; i++) {
                INSTANCE.add(new Instructor(instructorNames[i], Long.valueOf(i+1)));
            }
        }
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }


}
