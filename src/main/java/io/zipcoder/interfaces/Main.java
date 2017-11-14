package io.zipcoder.interfaces;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Students students = Students.getInstance();
        Student[] sup = students.getArray();
        System.out.println(Arrays.toString(sup));

        Instructors instructors = Instructors.getInstance();
        Instructor[] hi = instructors.getArray();
        System.out.println(Arrays.toString(hi));
    }
}
