package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestStudents {
    @Test
    public void testCohortInstance() {
        // Given
        Students students = Students.getInstance();
        // created a student with same id and name for each
        Student Manny  = new Student(122L, "Manny");
        Student ZachK = new Student(123L, "ZachK");
        Student Rex = new Student(124L, "Rex");
        Student Nisha = new Student(125L, "Nisha");
        Student Bobbi = new Student(126L, "Bobbi");
        Student Aidan = new Student(127L, "Aidan");
        Student Charnae = new Student(128L, "Charnae");
        Student Chuck = new Student(129L, "Chuck");
        Student Dee = new Student(130L, "Dee");
        Student Dipinti = new Student(131L, "Dipinti");
        Student Jen = new Student(132L, "Jen");
        Student Jeremy = new Student(133L, "Jeremy");
        Student John = new Student(134L, "John");
        Student ZachS = new Student(135L, "ZachS");
        Student Laura = new Student(136L, "Laura");
        Student Nathan = new Student(137L, "Nathan");
        Student Nikki = new Student(138L, "Nikki");
        Student Raymond = new Student(139L, "Raymond");
        Student Sean = new Student(140L, "Sean");
        Student Sitara = new Student(141L, "Sitara");
        Student Tatiana = new Student(142L, "Tatiana");
        Student Wesley = new Student(143L, "Wesley");

        // When
        // boolean that checks if students contains the student created in given
        boolean containsManny = students.contains(Manny);
        boolean containsZachK = students.contains(ZachK);
        boolean containsRex = students.contains(Rex);

        // Then
        // assert true for everyone
        Assert.assertTrue(containsManny);
        Assert.assertTrue(containsZachK);
        Assert.assertTrue(containsRex);
    }
}
