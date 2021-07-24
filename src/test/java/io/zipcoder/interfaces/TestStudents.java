package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void testingSingleton () {
        Student student1 = new Student();
        Student student2 = new Student();
        Integer expected = 2;

        Students.getInstance().add(student1);
        Students.getInstance().add(student2);
        Integer actual = Students.getInstance().count();

        Assert.assertEquals(expected, actual);
    }
}
