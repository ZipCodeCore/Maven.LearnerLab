package io.zipcoder.interfaces;

public class Students extends People {

    private static final Students INSTANCE = new Students();

    private Students() {
//        Student mikey = new Student(21);
//        Student davey = new Student(22);
//        Student timmy = new Student(23);
//        Student tommy = new Student(24);
//        INSTANCE.add(mikey);
//        INSTANCE.add(davey);
//        INSTANCE.add(timmy);
//        INSTANCE.add(tommy);
    }

    public static Students getInstance() {

        if (INSTANCE == null) {
            new Students();
        }
        return INSTANCE;
    }

}
