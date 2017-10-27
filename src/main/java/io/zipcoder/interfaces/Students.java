package io.zipcoder.interfaces;

public final class Students extends People{

    private static final Students INSTANCE = new Students();

    private String[] studentNames = new String[]{
            "Aaron Herion",
            "Abrar Mohammed",
            "Andrea Susnick",
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
            "Zan Cheema"
    };


    private Students(){
        if (INSTANCE == null) {
            for (int i = 0; i < studentNames.length; i++) {
                INSTANCE.add(new Student(studentNames[i], Long.valueOf(i+10)));
            }
        }
    }

    public static Students getInstance(){
        return INSTANCE;
    }



}
