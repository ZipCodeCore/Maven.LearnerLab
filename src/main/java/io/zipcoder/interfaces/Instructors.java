package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {

    private static Instructors INSTANCE;

    private Instructors(){
        long id = 0;
        for(Educator educator: Educator.values()){
            add(new Instructor(educator, id));
            id++;
        }
    }

    public static Instructors getINSTANCE(){
        if (INSTANCE != null){
            return INSTANCE;
        }
        else{
            INSTANCE = new Instructors();
            return INSTANCE;
        }
    }

    public String[] contains(String[] instructorsName){
        return instructorsName;
    }

    public Instructor[] getArray() {
        return personList.toArray(new Instructor[personList.size()]);
    }
}
