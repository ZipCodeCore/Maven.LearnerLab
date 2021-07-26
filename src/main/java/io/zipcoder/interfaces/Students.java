package io.zipcoder.interfaces;


public final class Students extends People<Student> {
    private static final Students INSTANCE = new Students();

    private Students(){
        Student Brian = new Student(1);
        Student Lawrence = new Student(2);
        Student Madeline = new Student(3);
        Student April = new Student(4);
        personList.add(Brian);
        personList.add(Lawrence);
        personList.add(Madeline);
        personList.add(April);
    }
    public static Students getInstance(){
        return INSTANCE;
    }

    public Student[] getArray() {
        return personList.stream().toArray(Student[]::new);
    }
}
