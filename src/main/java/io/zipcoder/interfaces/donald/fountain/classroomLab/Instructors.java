package io.zipcoder.interfaces.donald.fountain.classroomLab;

public final class Instructors extends People<Instructor> {

    private final static Instructors INSTANCE = new Instructors();

    private Instructors() {

//        String[] instructors = {"Dolio", "Zach", "Tariq", "Iyasu", "Janelle", "Melanie", "Samantha", "Makalia"};
//        int count = 0;
//
//        for(String name: instructors){
//            count ++;
//
//            Instructor instructor = new Instructor(count);
//            instructor.setName(name);
//
//            super.addPerson(instructor);
//        }

        for(Educator instructor: Educator.values())
        addPerson(instructor.instructor);
    }

    public static Instructors getInstance(){ return INSTANCE; }

    @Override
    public Instructor[] getArray() {
        Instructor[] instructors = new Instructor[personList.size()];
        for(int i = 0; i < personList.size(); i++){
            instructors[i] = personList.get(i);
        }
//        super.personList.stream().toArray(Student[] :: new);
        return personList.toArray(new Instructor[personList.size()]);
    }
}
