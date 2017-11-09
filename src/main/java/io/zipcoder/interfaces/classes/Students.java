package io.zipcoder.interfaces.classes;

public final class Students extends People {


    private static final Students INSTANCE = new Students();

    private Students() {

        String[] students = new String[]{

                "Aaron Herion",
                "Abrar Mohammed",
                "Andrea Susnick",
                "Andrew Kutchen",
                "Brian Sutton",
                "Claude McAlpin",
                "Donal Fountain",
                "Gabriela Lisboa",
                "Graham Nielsen",
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
                "Zach Stimmel",
                "Zan Cheema"
        };

        for (int i = 0; i < students.length; i++) {
            Student current = new Student(i);
            String name = students[i];
            current.setName(name);
            add(current);
        }
    }

    public static Students getINSTANCE() {
        return INSTANCE;

    }


}
