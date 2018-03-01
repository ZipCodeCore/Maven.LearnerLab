package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {
    @Test
    public void testImplementation() {
        Assert.assertTrue(Educator.tariq instanceof Teacher);
    }

    @Test
    public void teach() {
        //Given
        Student student1 = new Student(3);
        Educator.tariq.teach(student1, 4);
        //When
        double expected = 6;
        double actual = student1.getTotalStudyTime();
        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void lecture() {
        //Given
        Student[] students = new Student[4];
        Student student1 = new Student(1);
        Student student2 = new Student(2);
        Student student3 = new Student(3);
        Student student4 = new Student(4);
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;
        double numberOfHours = 30;
        Educator.tariq.lecture(students, numberOfHours);


        //When
        double expected = 8;
        double actual = students[0].getTotalStudyTime();

        //Then
        Assert.assertEquals(expected, actual, 0.01);
    }
}