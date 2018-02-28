package io.zipcoder.interfaces;

public final class Students {

    private static final Students INSTANCE = new Students();

    private Students(){
        Student april = new Student(1, "April");
        Student karen = new Student(2, "Karen");
        Student kibret = new Student(3, "Kibret");
        Student frankie = new Student(4, "Frankie");
        Student madeline = new Student(5, "Madeline");
        Student brian = new Student(6, "Brian");
        Student lawrence = new Student(7, "Lawrence");
        Student patrick = new Student(8, "Patrick");
        Student anthony = new Student(9, "Anthony");
        Student josh = new Student(10, "Josh");
        Student keith = new Student(11, "Keith");
        Student kat = new Student(12, "Kat");
        Student kay = new Student(13, "Kay");
        Student bo = new Student(14, "Bo");
        Student luis = new Student(15, "Luis");

    }
    public static Students getInstance(){
        return INSTANCE;
    }
}
