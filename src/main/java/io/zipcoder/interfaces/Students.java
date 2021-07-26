package io.zipcoder.interfaces;

public final class Students extends People<Student> {

    private static final Students INSTANCE = new Students();

    private Students(){
        Student student = new Student(2, "John");
        Student student1 = new Student(3, "Bob");
        Student student2 = new Student(4, "Mikey");

        personList.add(student);
        personList.add(student1);
        personList.add(student2);

    }
    public static Students getInstance(){
        return INSTANCE;
    }

}
