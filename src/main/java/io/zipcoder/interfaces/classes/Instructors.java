package io.zipcoder.interfaces.classes;

public class Instructors extends People{

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        String [] instructors = new String[]{

                "Tariq Hook",
                "Leon Hunter",
                "Dolio Durant"
        };

        for (int i = 0; i < instructors.length;i++){
            Instructor current = new Instructor(i);
            String name = instructors[i];
            current.setName(name);
            add(current);
        }
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }
}
