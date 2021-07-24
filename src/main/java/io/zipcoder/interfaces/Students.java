package io.zipcoder.interfaces;

public final class Students extends People<Student> {
    private static final Students INSTANCE = new Students();

    private Students(){
        this.add(new Student(1l,"Nick"));
        this.add(new Student(2l, "Jeremy"));
        this.add(new Student(3l, "Zach"));
        this.add(new Student(4l, "Jen"));
        this.add(new Student(5l, "Nathan"));
    }


    public static Students getInstance(){
        return INSTANCE;
    }

    @Override
    public Student[] toArray() {
        return new Student[0];
    }
}
