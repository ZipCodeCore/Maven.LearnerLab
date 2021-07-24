package io.zipcoder.interfaces;

public class Students extends People{

    private static final Students INSTANCE = new Students();

    private Students() {
        this.add(new Student(1L, "Jen"));
        this.add(new Student(2L, "Dee"));
        this.add(new Student(3L, "Zach"));
        this.add(new Student(4L, "Jeremy"));
    }

    public static Students getInstance() { return INSTANCE; }

}
