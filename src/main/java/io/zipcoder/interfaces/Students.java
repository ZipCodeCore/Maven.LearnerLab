package io.zipcoder.interfaces;

public class Students extends People <Student>  {

    private final static Students INSTANCE = new Students();

    public static Students getINSTANCE() {
        return INSTANCE;
    }

    private Students(){
        super.add(new Student(1, "Aaron Heiron"));
        super.add(new Student(2, "Abrar Mohammed"));
        super.add(new Student(3, "Andrea Susnick"));
        super.add(new Student(4, "Andrew Kutchen"));
        super.add(new Student(5, "Claude McAlpin"));
        super.add(new Student(6, "elliot Kozulak"));
        super.add(new Student(7, "Gabriela Lisboa"));
        super.add(new Student(8, "Greg Patselas"));
        super.add(new Student(9, "Jeff Lawrence"));
        super.add(new Student(10, "Katherine Anderson"));
        super.add(new Student(11, "Lina Zhang"));
        super.add(new Student(12, "Linda Qui"));
        super.add(new Student(13, "Oleg Stirbu"));
        super.add(new Student(14, "Pavel Parfenov"));
        super.add(new Student(15, "Raul Cubila Perez"));
        super.add(new Student(16, "Timothy Rager"));
        super.add(new Student(17, "Wesley Connors"));
        super.add(new Student(18, "Zachary Stimmel"));
        super.add(new Student(19, "Zan Cheema"));
        super.add(new Student(20, "Donald Fountain"));
        super.add(new Student(21, "Logan Hanner"));
        super.add(new Student(22, "Rob Kruzel"));
        super.add(new Student(23, "Ryan Maiale"));
        super.add(new Student(24, "Vince Paris"));
    }


    @Override
    public Student[] getArray() {
        return personList.toArray(new Student[INSTANCE.getCount()]);
    }
}

