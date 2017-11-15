package io.zipcoder.interfaces.Class;

import java.util.ArrayList;

public final class Instructors extends People<Instructor>{
    private final static Instructors INSTRUCTORS = new Instructors();

    public static Instructors getInstructors(){
        return INSTRUCTORS;
    }

    public Instructors(){
        String[] instructors = {"Tariq","Leon","Dolio"};

        for(int InstructorID = 0;InstructorID<instructors.length;InstructorID++){
            Instructor currentInstructor = new Instructor(InstructorID+1000);
            String name = instructors[InstructorID];
            currentInstructor.setName(name);
            add(currentInstructor);
        }
    }

    public ArrayList<Instructor> getArray() {
        return super.peopleList;
    }
}
