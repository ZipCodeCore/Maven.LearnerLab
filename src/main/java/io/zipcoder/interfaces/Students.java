package io.zipcoder.interfaces;

public final class Students extends People {

    private static final Students INSTANCE = new Students();

    private Students(){
        Student zipCodeStudent1 = new Student(1);
        Student zipCodeStudent2 = new Student(2);
        Student zipCodeStudent3 = new Student(3);
        Student zipCodeStudent4 = new Student(4);

        super.add(zipCodeStudent1);
        super.add(zipCodeStudent2);
        super.add(zipCodeStudent3);
        super.add(zipCodeStudent4);
    }

    public void test() {}

    public static Students getInstance(){
        return INSTANCE;
    }

}
