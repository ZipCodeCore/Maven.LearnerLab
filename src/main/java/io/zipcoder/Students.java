package io.zipcoder;

public final class Students extends People{
    private static final Students INSTANCE = new Students();

    private Students() {
        Student Keith = new Student("Keith", 1000L);
        Student Madeline = new Student("Madeline", 1001L);
        Student Anthony = new Student("Anthony", 1002L);
        Student Brian = new Student("Brian", 1003L);
        Student Luis = new Student("Luis", 1004L);
        Student Corrine = new Student("Corrine", 1005L);
        Student Pat = new Student("Pat", 1006L);
        Student Lawrence = new Student("Lawrence", 1007L);
        personList.add(Keith);
        personList.add(Madeline);
        personList.add(Anthony);
        personList.add(Brian);
        personList.add(Luis);
        personList.add(Corrine);
        personList.add(Pat);
        personList.add(Lawrence);
    }

    public static Students getInstance() {
        return INSTANCE;
    }

}
