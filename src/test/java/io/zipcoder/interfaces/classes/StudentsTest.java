package io.zipcoder.interfaces.classes;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {

    @Test
    public void TestStudents() {

        Students test = Students.getINSTANCE();
        String expected = "Zach Stimmel";

        Student teststudent = test.findById(25);
        String actual = teststudent.getName();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testStudentsGetArray(){
        String expected = "Zach Stimmel";
        String actual = (Students.getINSTANCE().getArray())[25].getName();

        Assert.assertEquals(expected,actual);
    }
}