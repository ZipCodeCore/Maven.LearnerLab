package io.zipcoder.interfaces.classes;

public final class Students extends People{

    private static final Students INSTANCE = new Students();

    protected Students(){

        Student zach = new Student(1,"Zach");

        INSTANCE.add(zach);
    }

    public static Students getINSTANCE() {
        return INSTANCE;
    }


}
