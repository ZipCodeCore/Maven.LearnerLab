package io.zipcoder.interfaces;

public final class Students extends People<Student>{


    static final Students INSTANCE= new Students();


    public Students() {
        this.add(new Student(1l,"char",9.0));
        this.add(new Student(2l,"sitara",7.0));
        this.add(new Student(3l,"bobbi",8.0));
        this.add(new Student(4l,"john",6.0));
    }

    public static Students getINSTANCE() {
        return INSTANCE;
    }
}
