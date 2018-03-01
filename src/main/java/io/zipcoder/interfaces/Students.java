package io.zipcoder.interfaces;

public final class Students extends People{
    private static final Students INSTANCE = new Students();

    private Students(){
       super();
    }

    public static Students getINSTANCE() {
        return INSTANCE;
    }
}
