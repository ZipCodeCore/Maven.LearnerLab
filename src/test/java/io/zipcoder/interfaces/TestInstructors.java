package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructors {


    @Test
    public void studentsContainsTest() {
        Instructors test = Instructors.getInstance();

        int actual = test.count();
        int expected = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void name() {
    }

    @Test
    public void instructorsContainsTest2() {
        Instructors test = Instructors.getInstance();
        Person actual = test.findById(35L);
        Person expected = test.personList.get(0);

        Assert.assertEquals(expected, actual);
    }
}

