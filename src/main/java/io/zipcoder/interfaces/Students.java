package io.zipcoder.interfaces;

public final class Students extends People {

    private static final Students INSTANCE = new Students();

    protected Students(){

        this.add(new Student(44, "Malcolm"));
        this.add(new Student(17, "Charlotte"));
        this.add(new Student(16 , "Chung"));
        this.add(new Student(6, "Val"));
        this.add(new Student(9, "Grace"));
        this.add(new Student(3, "Manny"));
        this.add(new Student(15, "Eddie"));
    }

    public static Students getInstance() {
        return INSTANCE;
    }




}