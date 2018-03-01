package io.zipcoder.interfaces;

public class Students extends People <Student>{

    private static final Students INSTANCE = new Students();

    Students(){

    }

    public static Students getInstance(){
        return INSTANCE;
    }
    public Student[] getArray() {
        return personList.toArray(new Student[personList.size()]);
    }

}
