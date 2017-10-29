package io.zipcoder.interfaces;

public final class Students extends People {
    private static final Students INSTANCE = new Students();

    private String[] studentNameList = new String[]{
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
            "Zan Cheema"
    };

    private Students() {
        for (int i = 0; i < studentNameList.length; i++) {
            super.add(new Student(studentNameList[i], Long.valueOf(i))); ;
        }
    }

    public static Students getInstance(){
        return INSTANCE;
    }



}
