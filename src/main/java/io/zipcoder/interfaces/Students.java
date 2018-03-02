package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Arrays;

public final class Students extends People<Student> {

    private static final Students INSTANCE = new Students();


    private Students() {
        Student p1 = new Student(100);
        p1.setName("Anthony");
        Student p2 = new Student(101);
        p2.setName("April");
        Student p3 = new Student(102);
        p3.setName("Carolynn");
        Student p4 = new Student(103);
        p4.setName("Daniel");
        Student p5 = new Student(104);
        p5.setName("Frankie");
        Student p6 = new Student(105);
        p6.setName("Jess");
        Student p7 = new Student(106);
        p7.setName("Joe");
        Student p8 = new Student(107);
        p8.setName("Luis");
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        this.add(p5);
        this.add(p6);
        this.add(p7);
        this.add(p8);

    }

    public void add(Student person) {
        personList.add(person);
    }

    public Student[] getArray(){
        Student[] personArray = new Student[personList.size()];
        for(int i = 0; i<personList.size(); i++) {
            personArray[i] = personList.get(i);
        }
        return personArray;
    }

    public static Students getInstance() {
        return INSTANCE;
    }

}
