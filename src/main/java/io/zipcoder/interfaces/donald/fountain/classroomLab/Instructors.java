package io.zipcoder.interfaces.donald.fountain.classroomLab;

public final class Instructors extends People {

    private final static Instructors INSTANCE = new Instructors();

    private Instructors() {

        String[] instructors = {"Dolio", "Zach", "Tariq", "Iyasu", "Janelle", "Melanie", "Samantha", "Makalia"};

        int count = 0;

        for(String name: instructors){
            count ++;

            Person instructor = new Instructor(count);
            instructor.setName(name);

            super.addPerson(instructor);
        }
    }

    public static Instructors getInstance(){ return INSTANCE; }
}
