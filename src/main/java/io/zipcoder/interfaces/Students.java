package io.zipcoder.interfaces;

public class Students extends People<Student> {

    private static final Students INSTANCE = new Students();

    private Students() {
        add(new Student(1, "Sitara"));
        add(new Student(2, "Nicholas"));
        add(new Student(3, "Denee"));
        add(new Student(4, "Charnae"));
        add(new Student(5, "Jennifer"));
        add(new Student(6, "Nathan"));
        add(new Student(7, "Zach S"));
        add(new Student(8, "Jeremy"));
        add(new Student(9, "Zach K"));
        add(new Student(10, "Emmanuel"));
        add(new Student(11, "Bobbi"));
        add(new Student(12, "Rex"));
        add(new Student(13, "Nishaben"));
        add(new Student(14, "Raymond"));
        add(new Student(15, "Dipinti"));
        add(new Student(16, "John"));
        add(new Student(17, "Tatiana"));
        add(new Student(18, "Laura"));
    }

    public static Students getInstance() {
        return INSTANCE;
    }

    @Override
    public Student[] toArray() {
        return personList.toArray(new Student[0]);
    }
}
