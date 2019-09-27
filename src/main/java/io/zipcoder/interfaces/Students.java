package io.zipcoder.interfaces;

public final class Students extends People  {

    private static final Students INSTANCE = new Students();
    //nullary constructor
    private Students() {
    }

    public static Students getInstance() {
        return INSTANCE;
    }

}
