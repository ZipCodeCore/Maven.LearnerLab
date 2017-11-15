package io.zipcoder.interfaces.classes;

import java.util.ArrayList;

public class Instructors extends People<Instructor>{

    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
//        String [] instructors = new String[]{
//
//                "Tariq Hook",
//                "Leon Hunter",
//                "Dolio Durant"
//        };
//
//        for (int i = 0; i < instructors.length;i++){
//            Instructor current = new Instructor(i);
//            String name = instructors[i];
//            current.setName(name);
//            add(current);
//        }
        super();
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

    public Instructor[] getArray() {
        return super.personList.toArray(new Instructor[getCount()]);
    }
}
