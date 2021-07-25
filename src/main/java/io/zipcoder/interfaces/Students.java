package io.zipcoder.interfaces;

import java.util.ArrayList;

public final class Students extends People<Student> {
    private static final Students INSTANCE = new Students();

    private Students() {
        this.add(new Student(644L, "Nick"));
        this.add(new Student(645L, "Char"));
        this.add(new Student(646L, "Sitara"));
        this.add(new Student(647L, "Zach"));
        this.add(new Student(648L, "Dipinti"));
        this.add(new Student(649L, "Jeremy"));
        this.add(new Student(650L, "Tatiana"));
        this.add(new Student(651L, "Ray"));
        this.add(new Student(652L, "Nisha"));
        this.add(new Student(653L, "Manny"));
        this.add(new Student(654L, "Nathan"));
        this.add(new Student(655L, "Laura"));
        this.add(new Student(656L, "Jen"));
        this.add(new Student(657L, "Zachary"));
        this.add(new Student(658L, "John"));
        this.add(new Student(659L, "Bobbi"));
        this.add(new Student(660L, "Rex"));

    }

    public static Students getInstance() {
        return INSTANCE;
    }

    @Override
    public Student[] getArray() {
        return personList.toArray(new Student[0]);
    }
}
