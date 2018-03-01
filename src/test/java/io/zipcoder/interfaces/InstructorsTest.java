package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class InstructorsTest{
    @Test
    public void testInstructorsSingleton(){
        Instructors ourTeacherList = Instructors.getInstance();

        Assert.assertTrue(ourTeacherList.findById(5) != null);
        Assert.assertTrue(ourTeacherList.findById(6) != null);
        Assert.assertTrue(ourTeacherList.findById(7) != null);
        Assert.assertTrue(ourTeacherList.findById(8) != null);
        Assert.assertTrue(ourTeacherList.findById(9) != null);
        Assert.assertTrue(ourTeacherList.findById(10) != null);
        Assert.assertTrue(ourTeacherList.findById(11) != null);

    }
}
