package io.zipcoder.interfaces;


import java.util.ArrayList;

public class TechConnect {

/*
Statically instantiate a private ArrayList of Student objects called studentList.
Create a public static method called recruitStudent which adds a Student to the studentList and returns void.
Create a public static method called getStudents which returns the studentList.
Create a public static method called removeStudents which clears our studentList.
*/


    private static ArrayList<Student> studentList = new ArrayList<Student>();

    static { // static initializer
        String[] studentNames = { "Karen", "Liel", "Quinn", "Destiny", "Blesson", "Danielle B.", "Andre", "Jeff",
                "Carlo", "Julia D.", "Natalie", "Julia E.", "Shylee", "Genevieve", "Margo", "Whitney", "Rachel",
                "Bridget", "Seung", "Jessica", "Harry", "Kesler", "Darin", "Jade", "Dominika", "Nashae", "Brianna",
                "Laurent", "Rina", "Emily", "Elisha", "Caitlin", "Kierra", "Dana", "Alyssa", "Humaira", "Prajwal",
                "Cristine", "Blesson2", "Brendan" };

        for (String studentName : studentNames) {
            Student student = new Student(studentName);
           recruitStudent(student);
        }
    }

    public static void recruitStudent(Student studentNames) {
        studentList.add(studentNames);
    }

    public static ArrayList<Student> getStudents() {
        return studentList;
    }

    public static void removeStudents() {
        studentList.clear();
    }

}
