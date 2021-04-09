package io.zipcoder.interfaces;

public final class Students extends People<Student> {

    private static final Students INSTANCE = new Students();

    private Students() {
        Student Madeline = new Student("Madeline", 1000);
        Student Keiran = new Student("Keiran", 1001);
        Student VinceM = new Student("VinceM", 1002);
        Student Keith = new Student("Keith", 1003);
        Student Patrick = new Student("Patrick", 1004);
        personList.add(Madeline);
        personList.add(Keiran);
        personList.add(VinceM);
        personList.add(Keith);
        personList.add(Patrick);
    }

    public static Students getInstance() {
        return INSTANCE;
    }

    public Integer getCount() {
        return personList.size();
    }

    @Override
    public Student[] getArray() {
        Student[] studentArray = new Student[personList.size()];
        studentArray = personList.toArray(studentArray);
        return studentArray;
    }
}
