package io.zipcoder.interfaces;

public final class Students extends People {

    private static final Students INSTANCE = new Students();

    private Students() {
        super.add(new Student(0, "Aaron Heiron"));
        super.add(new Student(1, "Abrar Mohammed"));
        super.add(new Student(2, "Andrea Susnick"));
        super.add(new Student(3, "Andrew Kutchen"));
        super.add(new Student(4, "Claude McAlpin"));
        super.add(new Student(5, "elliot Kozulak"));
        super.add(new Student(6, "Gabriela Lisboa"));
        super.add(new Student(7, "Greg Patselas"));
        super.add(new Student(8, "Jeff Lawrence"));
        super.add(new Student(9, "Katherine Anderson"));
        super.add(new Student(10, "Lina Zhang"));
        super.add(new Student(11, "Linda Qui"));
        super.add(new Student(12, "Oleg Stirbu"));
        super.add(new Student(13, "Pavel Parfenov"));
        super.add(new Student(14, "Raul Cubila Perez"));
        super.add(new Student(15, "Timothy Rager"));
        super.add(new Student(16, "Wesley Connors"));
        super.add(new Student(17, "Zachary Stimmel"));
        super.add(new Student(18, "Zan Cheema"));
        super.add(new Student(19, "Donald Fountain"));
        super.add(new Student(20, "Logan Hanner"));
        super.add(new Student(21, "Rob Kruzel"));
        super.add(new Student(22, "Ryan Maiale"));
        super.add(new Student(23, "Vince Paris"));
    }

    public static Students getInstance() {
        return INSTANCE;
    }
}
