package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EducatorTest {

    Educator tariq;
    Educator froilan;
    Educator leon;
    Educator wilhem;
    Student kibret;
    Students students;

    @Before
    public void setup() {
        tariq = Educator.TARIQ;
        froilan = Educator.FROILAN;
        leon = Educator.LEON;
        wilhem = Educator.WILHEM;
        kibret = new Student(33);
        students = Students.getInstance();
        students.add(kibret);
    }

    @Test
    public void implementationTest1() {
        Assert.assertTrue(froilan instanceof Teacher);
    }

    @Test
    public void implementationTest2() {
        Assert.assertTrue(wilhem instanceof Teacher);
    }

    @Test
    public void teachTest() {
        Educator.LEON.teach(kibret, 24);
        double expected = 24;
        double actual = Educator.LEON.timeWorked;
        Assert.assertEquals(expected, actual, 0.05);
    }

    @Test
    public void lectureTest() {
        Educator.WILHEM.lecture(students.getArray(), 50);
        double expected = 50;
        double actual = Educator.WILHEM.timeWorked;
        Assert.assertEquals(expected, actual, 0.05);
    }

}
