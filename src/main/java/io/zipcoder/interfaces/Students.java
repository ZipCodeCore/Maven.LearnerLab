package io.zipcoder.interfaces;

public class Students<E extends People>{

    private static final Students INSTANCE = new Students();

    Students(){

    }

    public static E getInstance(){
        return INSTANCE;
    }
    public <E>[] getStudentArray() {
        E[] allStudents = new E[getArray().length];
        for(int i =0; i < getArray().length; i++) {
            allStudents[i] = (E)getArray()[i];
        }
        return allStudents;
    }

}
