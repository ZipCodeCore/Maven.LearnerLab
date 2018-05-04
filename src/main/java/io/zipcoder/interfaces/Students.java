package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Arrays;

public final class Students extends People<Student> {

    private static final Students INSTANCE = new Students();


    private Students() {
        Student p1 = new Student(100, "Anthony");
        Student p2 = new Student(101, "April");
        Student p3 = new Student(102, "Carolynn");
        Student p4 = new Student(103, "Daniel");
        Student p5 = new Student(104, "Frankie");
        Student p6 = new Student(105, "Jess");
        Student p7 = new Student(106, "Joe");
        Student p8 = new Student(107, "Luis");
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        this.add(p5);
        this.add(p6);
        this.add(p7);
        this.add(p8);

    }

    public void add(Student student) {
        getPersonList().add(student);
    }

    public Student[] getArray(){
        Student[] personArray = new Student[getPersonList().size()];
        for(int i = 0; i<personArray.length; i++) {
            personArray[i] = getPersonList().get(i);
        }
        return personArray;
    }

    public String studentArrayToString(Student[] array){
        String x = "";
        for(Student student: array){
            x+= student.getName() + " ";
        }
        return x;
    }

    public static Students getInstance() {
        return INSTANCE;
    }

}
