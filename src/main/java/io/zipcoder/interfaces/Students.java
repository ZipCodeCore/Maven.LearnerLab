package io.zipcoder.interfaces;


public final class Students extends People{
    private static final Students INSTANCE = new Students();

    private Students() {
        Student student1 = new Student(1);
        student1.setName("Anthony");
        Student student2 = new Student(2);
        student2.setName("Bo");
        Student student3 = new Student(3);
        student3.setName("Brian");
        Student student4 = new Student(4);
        student4.setName("Katrina");
        Student student5 = new Student(5);
        student5.setName("Kay");

        addPerson(student1);
        addPerson(student2);
        addPerson(student3);
        addPerson(student4);
        addPerson(student5);
    }

    public static Students getInstance() {
            return INSTANCE;
    }
}
