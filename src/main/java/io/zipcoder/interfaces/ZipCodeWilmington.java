package io.zipcoder.interfaces;

import java.util.ArrayList;
public class ZipCodeWilmington {

/*
Statically instantiate a private ArrayList of Instructor objects called instructorList.
Create a public static method called hire which adds an Instructor to the instructorList and returns void.
Create a public static method called getInstructors which returns the instructorList.
Create a public static method called fireStaff which clears our instructorList.
Copy and paste this static initialization block immediately below your instructorList declaration.
*/

    private static ArrayList<Instructor> instructorList = new ArrayList();

    static { // static initializer
        String[] instructorNames = { "Leon", "Tariq", "Froilan", "David", "Zach", "Iyasu" };
        for (String instructorName : instructorNames) {
            Instructor instructor = new Instructor(instructorName);
            hire(instructor);
        }
    }

    public static void hire(Instructor instructor) {
       instructorList.add(instructor);
    }

    public static ArrayList<Instructor> getInstructorList() {
        return instructorList;
    }

    public static void fireStaff() {
        instructorList.clear();
    }
}
