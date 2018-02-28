package io.zipcoder.interfaces;

public class Students extends People {

    private static final Students INSTANCE = new Students();

    private Students(){

    }

    public static Students getInstance(){
        return INSTANCE;
    }
}
