package io.zipcoder.interfaces;

public final class Students extends People{

    private static final Students INSTANCE = new Students();

    private Students(){

        Student studentOne = new Student(212242L, "Brian");
        Student studentTwo = new Student(121231L, "Kievina");

        personList.add(studentOne);
        personList.add(studentTwo);

    }

    public static Students getInstance(){
        return INSTANCE;
    }
}
