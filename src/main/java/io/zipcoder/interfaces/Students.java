package io.zipcoder.interfaces;

public class Students extends People<Student>{

    private static final Students INSTANCE = new Students();

    private Students() {
        this.add(new Student(1L, "Jen"));
        this.add(new Student(2L, "Dee"));
        this.add(new Student(3L, "Zach"));
        this.add(new Student(5L, "Nick"));
    }

    public static Students getInstance() { return INSTANCE; }

    @Override
    public Student[] getArray() {
        return super.personList.toArray(new Student[0]);
    }
}
