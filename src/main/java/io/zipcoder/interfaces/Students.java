package io.zipcoder.interfaces;

public final class Students extends People<Student>{

    private static Students INSTANCE = null;

    String[] studentNames = new String[]{
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
        for (int i = 0; i < studentNames.length; i++) {
            this.personList.add(new Student(studentNames[i], (long) (i + 10)));
        }
    }

    public static Students getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new Students();
            return INSTANCE;
        } else {
            return INSTANCE;}
    }

    @Override
    public Student[] getArray() {
        return INSTANCE.personList.toArray(new Student[INSTANCE.getCount()]);
    }

    @Override
    public void reset() {
        INSTANCE = new Students();
    }
}
