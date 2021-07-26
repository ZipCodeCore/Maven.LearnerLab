package io.zipcoder.interfaces;

public final class Students extends People {
    private static final Students INSTANCE = new Students();
    private Students(){
        this.addPerson(new Student(100L, "Ray"));
        this.addPerson(new Student(101L, "John"));
        this.addPerson(new Student(102L, "Jeremy"));
        this.addPerson(new Student(103L, "Tati"));
        this.addPerson(new Student(104L, "Zach"));
        this.addPerson(new Student(105L, "Dee"));
        this.addPerson(new Student(106L, "Jen"));
    };
    public static Students getInstance(){
        return INSTANCE;
    }
}
