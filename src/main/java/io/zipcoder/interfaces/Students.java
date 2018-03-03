package io.zipcoder.interfaces;

public final class Students extends People<Student> {

    protected static final Students INSTANCE = new Students();

    private Students() {
        Student April = new Student(11L, "April");
        Student Amy = new Student(12L, "Amy");
        Student Bo = new Student(13L, "Bo");
        Student Dan = new Student(14L, "Dan");
        Student Eric = new Student(15L, "Eric");
        Student Gio = new Student(16L, "Gio");
        Student Luis = new Student(17L, "Luis");
        personList.add(April);
        personList.add(Amy);
        personList.add(Bo);
        personList.add(Dan);
        personList.add(Eric);
        personList.add(Gio);
        personList.add(Luis);
    }

    public static Students getInstance() {
        return INSTANCE;
    }

    // students.getArray() = Students.getInstance().getArray() = INSTANCE.getArray()
    // INSTANCE.getArray() ==> this returns Person[], not Student[], so need to downcast from Person to Student
    //    Animal animal = new Animal();
    //    Dog dog = (Dog) animal
    //    Student student = (Student) person;

    // Modified name to getArray(), from part 10
//    public Student[] getArray() {
//        Student[] students = new Student[INSTANCE.getArray().length];
//        for (int i = 0; i < INSTANCE.getArray().length; i++) {
//            Student student = (Student) INSTANCE.getArray()[i];
//            students[i] = student;
//        }
//        return students;
//    }

    public Student[] getArray() {
        return personList.toArray(new Student[0]);
    }
}
