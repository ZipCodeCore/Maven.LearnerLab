package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;

/*
Statically instantiate a private ArrayList of Student objects called students by
invoking the getStudents method on the TechConnect class.

Statically instantiate a private ArrayList of Instructor objects called instructors
by invoking the getInstructor method on the ZipCodeWilmington class.

Create a method named getRoster which returns a HashMapping of String to Person objects such that our ZipCodeWilmington
instructors and TechConnect students' names map to their respective Person object.
 */


public class Classroom {

    private static ArrayList<Student> students = new ArrayList<Student>(TechConnect.getStudents());
    private static ArrayList<Instructor> instructors = new ArrayList<Instructor>(ZipCodeWilmington.getInstructorList());


    public static HashMap<String, Person> getRoster() {

        HashMap<String, Person> map = new HashMap<String, Person>();

        for (int i = 0; i < students.size(); i++) {
            Student currentElement = students.get(i);
            map.put(currentElement.getName(), currentElement);
        }

        for (int i = 0; i < instructors.size(); i++) {
            Instructor currentElement = instructors.get(i);
            map.put(currentElement.getName(), currentElement);
        }

        return map;
    }
}
