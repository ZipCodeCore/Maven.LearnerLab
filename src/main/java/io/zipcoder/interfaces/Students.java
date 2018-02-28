package io.zipcoder.interfaces;

public final class Students extends People{

    private static Students INSTANCE;

    private Students(){
    Student Karl = new Student(444);
    Student George = new Student(555);
    Student Pete = new Student(666);
    Student Chuck = new Student(777);
    Student Chris = new Student(888);
    Student Alburto = new Student(999);

    this.add(Karl);
    this.add(George);
    this.add(Pete);
    this.add(Chuck);
    this.add(Chris);
    this.add(Alburto);
    }

    public static Students getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Students();
        }
        return INSTANCE;
    }
}
