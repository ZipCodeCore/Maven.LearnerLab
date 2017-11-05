package io.zipcoder.interfaces;

public final class Students extends People {

    static final Students INSTANCE = new Students();

    private Students() {

        INSTANCE.add(new Person(123, "Zan"));
        INSTANCE.add(new Person(456, "Jeff"));
        INSTANCE.add(new Person(789, "Sam"));
    }

    public static Students getInstance() {

        return INSTANCE;
    }


}
