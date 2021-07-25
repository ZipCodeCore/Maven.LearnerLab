package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

public class TestStudents {

    @Test
    public void isAllOfCohortInStudentsTest() {
        // Given
        Students students = Students.getInstance();
        Student sitara = new Student(1, "Sitara");
        Student nicholas = new Student(2, "Nicholas");
        Student denee = new Student(3, "Denee");
        Student charnae = new Student(4, "Charnae");
        Student jennifer = new Student(5, "Jennifer");
        Student nathan = new Student(6, "Nathan");
        Student zachS = new Student(7, "Zach S");
        Student jeremy = new Student(8, "Jeremy");
        Student zachK = new Student(9, "Zach K");
        Student emmanuel = new Student(10, "Emmanuel");
        Student bobbi = new Student(11, "Bobbi");
        Student rex = new Student(12, "Rex");
        Student nishaben = new Student(13, "Nishaben");
        Student raymond = new Student(14, "Raymond");
        Student dipinti = new Student(15, "Dipinti");
        Student john = new Student(16, "John");
        Student tatiana = new Student(17, "Tatiana");
        Student laura = new Student(18, "Laura");

        // When
        boolean studentsIncludesSitara = students.contains(sitara);
        boolean studentsIncludesNicholas = students.contains(nicholas);
        boolean studentsIncludesDenee = students.contains(denee);
        boolean studentsIncludesCharnae = students.contains(charnae);
        boolean studentsIncludesJennifer = students.contains(jennifer);
        boolean studentsIncludesNathan = students.contains(nathan);
        boolean studentsIncludesZachS = students.contains(zachS);
        boolean studentsIncludesJeremy = students.contains(jeremy);
        boolean studentsIncludesZachK = students.contains(zachK);
        boolean studentsIncludesEmmanuel = students.contains(emmanuel);
        boolean studentsIncludesBobbi = students.contains(bobbi);
        boolean studentsIncludesRex = students.contains(rex);
        boolean studentsIncludesNishaben = students.contains(nishaben);
        boolean studentsIncludesRaymond = students.contains(raymond);
        boolean studentsIncludesDipinti = students.contains(dipinti);
        boolean studentsIncludesJohn = students.contains(john);
        boolean studentsIncludesTatiana = students.contains(tatiana);
        boolean studentsIncludesLaura = students.contains(laura);

        // Then
        Assert.assertTrue(studentsIncludesSitara);
        Assert.assertTrue(studentsIncludesNicholas);
        Assert.assertTrue(studentsIncludesDenee);
        Assert.assertTrue(studentsIncludesCharnae);
        Assert.assertTrue(studentsIncludesJennifer);
        Assert.assertTrue(studentsIncludesNathan);
        Assert.assertTrue(studentsIncludesZachS);
        Assert.assertTrue(studentsIncludesJeremy);
        Assert.assertTrue(studentsIncludesZachK);
        Assert.assertTrue(studentsIncludesEmmanuel);
        Assert.assertTrue(studentsIncludesBobbi);
        Assert.assertTrue(studentsIncludesRex);
        Assert.assertTrue(studentsIncludesNishaben);
        Assert.assertTrue(studentsIncludesRaymond);
        Assert.assertTrue(studentsIncludesDipinti);
        Assert.assertTrue(studentsIncludesJohn);
        Assert.assertTrue(studentsIncludesTatiana);
        Assert.assertTrue(studentsIncludesLaura);
    }
}
