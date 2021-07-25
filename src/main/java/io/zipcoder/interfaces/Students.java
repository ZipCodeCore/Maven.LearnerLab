package io.zipcoder.interfaces;

public class Students extends People<Student> {

    private static final Students INSTANCE = new Students();

    private Students(){
        add(new Student(122L, "Manny"));
        add(new Student(123L, "ZachK"));
        add(new Student(124L, "Rex"));
        add(new Student(125L, "Nisha"));
        add(new Student(126L, "Bobbi"));
        add(new Student(127L, "Aidan"));
        add(new Student(128L, "Charnae"));
        add(new Student(129L, "Chuck"));
        add(new Student(130L, "Dee"));
        add(new Student(131L, "Dipinti"));
        add(new Student(132L, "Jen"));
        add(new Student(133L, "Jeremy"));
        add(new Student(134L, "John"));
        add(new Student(135L, "ZachS"));
        add(new Student(136L, "Laura"));
        add(new Student(137L, "Nathan"));
        add(new Student(138L, "Nikki"));
        add(new Student(139L, "Raymond"));
        add(new Student(140L, "Sean"));
        add(new Student(141L, "Sitara"));
        add(new Student(142L, "Tatiana"));
        add(new Student(143L, "Wesley"));

    }


    public static Students getInstance(){
        return INSTANCE;
    }


    @Override
    public Student[] toArray() {
        return personList.toArray(new Student[0]);
    }
}
