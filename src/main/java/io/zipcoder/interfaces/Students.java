package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Random;

public final class Students extends People<Student> {

    private static final Students INSTANCE = new Students();

    private String[] studentNames = {
            "Aaron Herion",
            "Abrar Mohammed",
            "Andrea Susnick",
            "Andrew Kutchen",
            "Brian Sutton",
            "Claude McAlpin",
            "Donald Fountain",
            "Elliott Kozulak",
            "Gabriela Lisboa",
            "Graham Nilsen",
            "Greg Patselas",
            "Jeff Lawrence",
            "Katherine Anderson",
            "Lina Zhang",
            "Linda Qiu",
            "Logan Hanner",
            "Merin Jose",
            "Oleg Stirbu",
            "Pavel Parfenov",
            "Raul Cubila Perez",
            "Rob Kruzel",
            "Ryan Maiale",
            "Samuel Haile",
            "Timothy Rager",
            "Vince Paris",
            "Wesley Connors",
            "Zachary Stimmel",
            "Zan Cheema"
    };

    private long generateId() {
        Random r = new Random();
        long id = (long) r.nextInt(1000);
        return id;
    }

    private Students() {
        super();
        for (String name : studentNames) {
            long studentID = generateId();
            add(new Student(studentID, name));
        }

    }

//    public Student[] getStudentsArray(){
//        return super.getArray().toArray(new Student[getCount()]);
//
//    }

    public static Students getInstance() {
        return INSTANCE;
    }


    @Override
    public ArrayList<Student> getArray() {
        return this.personList;
    }
}
