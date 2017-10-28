package io.zipcoder.interfaces;

import java.util.Random;

public final class Students extends People{

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
    private static final Students INSTANCE = new Students();

    private Students() {
        super();
        for(String name: names) {
            long nextId = assignNextId();
            add(new Student(nextId, name));
        }
    }

    public static Students getINSTANCE() {
        return INSTANCE;
    }

    public long assignNextId() {
        Random rand = new Random();
        long nextId;
        do {
            nextId = rand.nextLong();
            if(nextId < 0) {
                nextId *= -1;
            }
        } while(super.findById(nextId) != null);

        return nextId;
    }
}
