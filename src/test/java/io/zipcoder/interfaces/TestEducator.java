package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestEducator {

    @Test
    public void implementationTest(){
        Assert.assertTrue(Educator.ROBERTO instanceof Teacher);
    }

    @Test
    public void lectureTest(){
        Student[] students = {new Student(1231L, "Bill Cosby"), new Student(3213L, "Joe")};

        Double expected = 0.5 / students.length;
        Educator.DOLIO.lecture(students, 0.5);
        Assert.assertEquals(expected, students[0].getTotalStudyTime());
        Assert.assertEquals(expected, students[1].getTotalStudyTime());
    }

    @Test
    public void teachTest(){
        Student student = new Student(1231L, "Bill Cosby");

        Double expected = 0.5;
        Educator.DOLIO.teach(student,expected);
        Assert.assertEquals(expected, student.getTotalStudyTime());
    }

    @Test
    public void lectureTimeWorkedTest(){
        Student[] students = {new Student(1231L, "Bill Cosby"), new Student(3213L, "Joe")};

        Double expected = 1.0;
        Educator.ROBERTO.lecture(students, 0.5);
        Assert.assertEquals(expected, Educator.ROBERTO.timeWorked);
    }

    @Test
    public void teachTimeWorked(){
        Student[] students = {new Student(1231L, "Bill Cosby")};

        Double expected = 0.5;
        Educator.ROBERTO.lecture(students, 0.5);
        Assert.assertEquals(expected, Educator.ROBERTO.timeWorked);
    }
}
