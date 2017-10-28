package io.zipcoder.interfaces;

//Part 7.1 - Create Students singleton
//
//        Note: The creation of this class will demonstrate an implementation of singleton design pattern.
//        Create a Students class.
//        The class should be an unextendable subclass of the People class.
//        The class should statically instantiate a final field named INSTANCE of type Students.
//        The class should define a private nullary constructor which populates the INSTANCE field with respective
//        io.zipcoder.interfaces.Student representations of your colleagues.
//        Each student should have a relatively unique id field.
//        The class should define a getInstance method which returns the INSTANCE field.

public class Students extends People{

    private static final Students INSTANCE = new Students();

    private Students(){

        Student lina = new Student(1231, "Lina");
        Student abrar = new Student(1232, "Abrar");
        Student greg = new Student(1234, "Greg");
        Student raul = new Student(1235, "Raul");

        INSTANCE.addPerson(greg);
        INSTANCE.addPerson(raul);
        INSTANCE.addPerson(lina);
        INSTANCE.addPerson(abrar);

    }

    public static Students getINSTANCE() {
        return INSTANCE;
    }
}
