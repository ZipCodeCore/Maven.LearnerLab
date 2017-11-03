package io.zipcoder.interfaces;

import java.util.Random;

public final class Students extends People<Student>{

    private static final String[] names = {
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
    private static Students INSTANCE;

    private Students() {
        super();
        for(String name: names) {
            long nextId = assignNextId();
            add(new Student(nextId, name));
        }
    }

    public static Students getInstance() {
        if(INSTANCE != null) {
            return INSTANCE;
        }
        else {
            INSTANCE = new Students();
            return INSTANCE;
        }
    }

    public Student[] getArray() {
        return super.getArrayList().toArray(new Student[getCount()]);
    }
}
