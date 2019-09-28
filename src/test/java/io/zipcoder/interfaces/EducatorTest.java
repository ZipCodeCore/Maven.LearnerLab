package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.rmi.StubNotFoundException;

import static org.junit.Assert.*;

public class EducatorTest {

    @Test
    public void implementationTest(){
        Assert.assertTrue(Educator.TARIQ instanceof Teacher);
    }

    @Test
    public void inheritanceTest(){
        Assert.assertTrue(Educator.TARIQ instanceof Teacher);
        Assert.assertTrue(Educator.KRIS instanceof Teacher);
    }


    @Test
    public void teach() {
       Student student = new Student(111);
        Educator.TARIQ.teach(student, 15);
        double expected = 15;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual, .001);

    }

    @Test
    public void lecture() {
        Student[] student = new Student[3];
        Student student1 = new Student(11);
        Student student2 = new Student(22);
        Student student3 = new Student(33);
        student[0] = student1;
        student[1] = student2;
        student[2] = student3;

        Educator.WILLHELM.lecture(student, 30);
        double expected = 10.0;
        double actual = student1.getTotalStudyTime();

        Assert.assertEquals(expected, actual, .001);
    }
}