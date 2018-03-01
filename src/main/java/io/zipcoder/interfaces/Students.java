package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Arrays;

public final class Students extends People {

    private static final Students INSTANCE = new Students();

    private Students(){
        Student Anthony = new Student(100);
        Student April = new Student(101);
        Student Carolynn = new Student(102);
        Student Daniel = new Student(103);
        Student Frankie = new Student(104);
        Student Jess = new Student(105);
        Student Joe = new Student(106);
        Student Luis = new Student(107);
        personList.add(Anthony);
        personList.add(April);
        personList.add(Carolynn);
        personList.add(Daniel);
        personList.add(Frankie);
        personList.add(Jess);
        personList.add(Joe);
        personList.add(Luis);
    }

    public static Students getInstance(){
        return INSTANCE;
    }

}
