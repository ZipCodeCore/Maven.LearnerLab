package io.zipcoder.interfaces;

public final class Students extends People {

    private static final Students INSTANCE = new Students();

    private Students(){

        add(new Person(786,"Zan"));
        add(new Person(618,"Aaron"));
        add(new Person(371,"Elliott"));

    }

    public static Students getInstance(){

        return INSTANCE;

    }


}
