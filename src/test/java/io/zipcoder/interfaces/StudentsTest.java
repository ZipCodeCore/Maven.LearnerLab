package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentsTest {

    Student marky;
    Student ricky;
    Student danny;
    Student terri;
    Student kibret;

    @Before
    public void setup() {
        marky = new Student(11);
        ricky = new Student(12);
        danny = new Student(13);
        terri = new Student(14);
        kibret = new Student(15);
    }

    @Test
    public void studentsTest() {
        // uses methods add, remove, and getCount
        Students instance = Students.getInstance();
        instance.add(marky);
        instance.add(ricky);
        instance.add(danny);
        instance.add(terri);
        instance.remove(ricky);
        int expected = 3;
        int actual = instance.getCount();
        Assert.assertEquals(expected, actual);
    }


}
