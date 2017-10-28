package io.zipcoder.interfaces.classes;

public final class Students extends People{


    private static Students INSTANCE = new Students();

    private Students(){

        Student zach = new Student(1,"Zach");
        Student wes = new Student(2,"Bob");

    }

    public static Students getINSTANCE() {
        return INSTANCE;

    }



}
