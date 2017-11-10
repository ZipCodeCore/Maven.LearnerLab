package io.zipcoder.interfaces;

public class Students extends People{

    private static final Students INSTANCE = new Students();

    private Students() {

        String[] studentNames = {
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
                "Moose",
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

        for (int x = 0; x < studentNames.length; x++){
            Student studentToAdd = new Student(x, studentNames[x]);
            add(studentToAdd);
        }

    }

    public static Students getInstance(){
        return INSTANCE;
    }

}
