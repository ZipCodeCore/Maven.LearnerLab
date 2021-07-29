package io.zipcoder.interfaces;

public final class Students extends People<Student>{ //final makes it unextendable

    public static final Students INSTANCE = new Students();

    private Students(){
        add(new Student(1L, "Me", 1.0));
        add(new Student(2L, "Zachs", 1.0));
        add(new Student(3L, "Manny", 1.0));
        add(new Student(4L, "Nisha", 1.0));
        add(new Student(5L, "Bobbi", 1.0));
        add(new Student(6L, "Tati", 1.0));
        add(new Student(7L, "Jen", 1.0));
        add(new Student(8L, "John", 1.0));
        add(new Student(9L, "Laura", 1.0));
        add(new Student(10L, "Ray", 1.0));
        add(new Student(11L, "Nick", 1.0));
        add(new Student(12L, "Zachk", 1.0));
        add(new Student(13L, "Dipinti", 1.0));
        add(new Student(14L, "Dee", 1.0));
        add(new Student(15L, "Sitara", 1.0));
        add(new Student(16L, "Char", 1.0));
        add(new Student(17L, "Nathan", 1.0));
        add(new Student(18L, "Jeremy", 1.0));
        add(new Student(19L, "Rustle", 1.0));



    }

//    public Student[] toArray() {
//        Student[] personArr = super.elementList.toArray(new Student[0]);
//        return personArr;
//    }
    @Override
    public Student[] toArray() {
        return elementList.toArray(new Student[0]);

    }

    public static Students getInstance() {
        return INSTANCE;
    }
}
