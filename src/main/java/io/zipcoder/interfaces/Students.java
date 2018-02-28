package io.zipcoder.interfaces;

public final class Students extends People {

    private static final Students INSTANCE = new Students();

    private Students(){
        Student Mitch = new Student(1001);
        Student Brian = new Student(1111);
        Student Eric = new Student(2222);
        Student Pete = new Student(3333);
        Student Gio = new Student(4444);
        getPersonList().add(Mitch);
        getPersonList().add(Brian);
        getPersonList().add(Eric);
        getPersonList().add(Pete);
        getPersonList().add(Gio);
    }

    public static Students getInstance(){
        return INSTANCE;
    }

    public static Students[] getStudentsArray() {
        return (Students[]) getInstance().getPersonList().toArray();
    }

}