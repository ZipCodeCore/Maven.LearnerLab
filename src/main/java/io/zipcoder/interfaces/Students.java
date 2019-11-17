package io.zipcoder.interfaces;

public final class Students extends People<Student> {
    private static Students INSTANCE=new Students();

    private Students() {

        final Student INSTANCE = new Student(Long.MIN_VALUE, "", 0);

        Student s1= new Student(1L, "Julia", 4);
        Student s2 = new Student(2L, "Miral", 5);
        Student s3 = new Student(3L, "Chris", 3);
        Student s4 = new Student(4L, "Mike", 4);
        Student s5 = new Student(5L, "Grace", 7);
        Student s6 = new Student(6L, "Ron", 4);
        Student s7 = new Student(7L, "Usha", 4);
        Student s8 = new Student(8L, "Kane", 4);
        Student s9 = new Student(9L, "Val", 4);
        Student s10 = new Student(10L, "Ryan", 4);
        Student s11 = new Student(11L, "Brian", 4);


    }

     static Students getInstance() {

        return INSTANCE;

    }
    public Student[] toArray() {
        return personList.toArray(new Student[0]);
    }


}
