package io.zipcoder.interfaces;

public class Students extends People {

    private static final Students INSTANCE = new Students();

    private Students() {
        Student Madeline = new Student("Madeline", 1000);
        Student Keiran = new Student("Keiran", 1001);
        Student VinceM = new Student("VinceM", 1002);
        Student Keith = new Student("Keith", 1003);
        Student Patrick = new Student("Patrick", 1004);
        addPerson(Madeline);
        addPerson(Keiran);
        addPerson(VinceM);
        addPerson(Keith);
        addPerson(Patrick);
    }

    public static Students getInstance(){
        return INSTANCE;
    }
}
