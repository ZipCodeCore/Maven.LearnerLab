package io.zipcoder.interfaces.Class;

public final class Instructors extends People{
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
}
