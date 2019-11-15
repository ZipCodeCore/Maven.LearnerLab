package io.zipcoder.interfaces;

public final class Students extends People<Student> {
    private static final Students INSTANCE = new Students();

    private Students() {
        Student student = new Student(25, "Sandy");
        Student student1 = new Student(26, "Meeeee");
        Student student2 = new Student(27, "Kievina");

        personList.add(student);
        personList.add(student1);
        personList.add(student2);
    }

    public Student[] toArray() {
        return personList.toArray(new Student[personList.size()]);
    }

    public static Students getInstance() {
        return INSTANCE;
    }


}

