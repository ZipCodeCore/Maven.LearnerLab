package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void whereAllMyPeepsAt() {
        Students students = Students.getInstance();

        Student Rex = (new Student(1L, "Me", 1.0));
        Student Zachk = (new Student(2L, "Zachk", 1.0));
        Student manny = (new Student(3L, "Manny", 1.0));
        Student nisha = (new Student(4L, "Nisha", 1.0));
        Student bobbi = (new Student(5L, "Bobbi", 1.0));
        Student tati = (new Student(6L, "Tati", 1.0));
        Student jen = (new Student(7L, "Jen", 1.0));
        Student john = (new Student(8L, "John", 1.0));
        Student laura = (new Student(9L, "Laura", 1.0));
        Student ray = (new Student(10L, "Ray", 1.0));
        Student nick = (new Student(11L, "Nick", 1.0));
        Student zachs = (new Student(12L, "Zachs", 1.0));
        Student dipinti = (new Student(13L, "Dipinti", 1.0));
        Student dee = (new Student(14L, "Dee", 1.0));
        Student sitara = (new Student(15L, "Sitara", 1.0));
        Student charn = (new Student(16L, "Char", 1.0));
        Student nathan = (new Student(17L, "Nathan", 1.0));
        Student jeremy =(new Student(18L, "Jeremy", 1.0));
        Student rustle =(new Student(19L, "Rustle", 1.0));

        int expected = 22;
        int actual = students.count();

        Assert.assertEquals(expected, actual);
    }
}
