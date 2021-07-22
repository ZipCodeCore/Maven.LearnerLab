package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void testingSingleton () {
        Person student1 = new Student();
        Person student2 = new Student();
        Students.getInstance().add(student1);
        Students.getInstance().add(student2);
        Integer expected = 2;
        Integer actual = Students.getInstance().count();
        Assert.assertEquals(expected, actual);
    }
}
