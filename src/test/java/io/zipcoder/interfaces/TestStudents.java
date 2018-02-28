package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {

    @Test
    public void test(){
        Student april = new Student(1, "April");
        Assert.assertTrue(april instanceof Student);
    }
    @Test
    public void testGetInstance(){
        Students students1 = Students.getInstance();
        Students students2 = Students.getInstance();
        Assert.assertSame(students1, students2);

    }
}
